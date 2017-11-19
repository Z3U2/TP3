// Optional class, replaced with a lambda expression in Stock.java
import java.util.function.Predicate;

public class OlderPredicate implements Predicate<Produit> {

    private Produit pr;

    public OlderPredicate (Produit pr){
        this.pr = pr;
    }

    @Override
    public boolean test(Produit produit) {
        return produit.isOlder(pr);
    }
}
