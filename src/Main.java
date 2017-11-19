public class Main {

    public static void main(String[] args){
        Date d1 = new Date(12,06,1995);
        Date d2 = new Date(14,10,2000);
        Date d3 = new Date(06, 01,1997);
        Date d4 = new Date(14,07, 1995);
        Produit p1 = new Produit("1",d1);
        Produit p2 = new Produit("2",d2);
        Produit p3 = new Produit("3",d3);
        Produit p4 = new Produit("1",d4);

        Stock stock = new Stock();


        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        System.out.println("p3 = "+p3);
        System.out.println("p4 = "+p4);

        System.out.println("p1 == p2 ? "+p1.equals(p2));
        System.out.println("p1 == p4 ? "+p1.equals(p4));

        System.out.println("p1 comparé à p2 "+p1.compareTo(p2));
        System.out.println("p1 comparé à p4 "+p1.compareTo(p4));

        System.out.println("p1 plus ancien que p2 ? " + p1.isOlder(p2));
        System.out.println("p2 plus ancien que p3 ? " + p2.isOlder(p3));
        System.out.println("p1 plus ancien que p4 ? " + p1.isOlder(p4));

        System.out.println("Ajouter p1 ? " + stock.add(p1));
        System.out.println("Ajouter p2 ? " + stock.add(p2));
        System.out.println("Ajouter p3 ? " + stock.add(p3));
        System.out.println("Ajouter p4 ? " + stock.add(p4));

        System.out.println("\nstock :" + stock+"\n");

        System.out.println("\nLe produit le plus ancien est : "+stock.oldest()+"\n");
        System.out.println("\nLes produits expirés par rapport à la date de dt=" + d3 + stock.expiredProducts(d3)+"\n");
        stock.removeOlder(d3);
        System.out.println("\nOn enlève ses produits, stock est maintenant : " + stock+"\n");

        Stock stock1 = stock.clone();
        System.out.println("\nOn clone ce stock, nouveau stock : " + stock1 + "\n" );

        stock1.add(p4);
        System.out.println("\nOn ajoute p4 au nouveau stock : " + stock1 + "\n");
        System.out.println("\nLe premier stock : " + stock + "\n");

        p2.setCode("44");
        p2.setDt(new Date(1,1,1999));
        System.out.println("\nOn change p2 qui est dans le premier stock : " + stock + "\n");
        System.out.println("\nLe nouveau stock reste intact" + stock1 + "\n");

    }

}
