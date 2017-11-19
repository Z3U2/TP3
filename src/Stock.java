import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Stock extends LinkedList<Produit> implements Cloneable{
    public boolean add(Produit p){
        if (this.contains(p)){
            return false;
        }
        else {
            super.add(p);
            return true;
        }
    }

    public Produit oldest() {
//        return  Collections.max(this,new DateCompare());
         return Collections.max(this,((o1, o2) -> (-o1.compareDate(o2))));
         // Optional could be replaced with DateCompare cf previous line and DateCompare Class
    }

    public Stock expiredProducts(Date dt) {
        Produit pr = new Produit(dt);
        return this.stream()
                .filter(produit -> produit.isOlder(pr))
                // Optional could be replaced with OlderPredicate cf next line and OlderPredicate Class
//                .filter(new OlderPredicate(pr))
                .collect(Collectors.toCollection(Stock::new));
    }

    public void removeOlder(Date dt) {
        Produit pr = new Produit(dt);
        this.removeIf(produit -> produit.isOlder(pr));
        // Optional could be replaced with OlderPredicate cf next line and OlderPredicate Class
//        this.removeIf(new OlderPredicate(pr));
    }

    @Override
    public String toString() {
        return super.toString().replaceAll("\\[","{ \n").replaceAll("]","\n }").replaceAll(",","\n");
    }

    public Stock clone(){
        Stock res = new Stock();
        for (Produit p : this){
            try {
                res.add(p.clone());
            }
            catch (Exception e){
                System.out.println("Clone Not Supported Exception");
                System.exit(1);
            }

        }
        return res;
    }
}
