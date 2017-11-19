// Optional class, replaced with a lambda expression in Stock.java
import java.util.Comparator;

public class DateCompare implements Comparator<Produit> {
    @Override
    public int compare(Produit o1, Produit o2) {
        return -o1.compareDate(o2);
    }
}
