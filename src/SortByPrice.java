import java.util.Comparator;

/**
 * A comparator class for sorting Cosmetic objects based on their price in ascending order.
 */
public class SortByPrice implements Comparator<Cosmetic> {
    @Override
    public int compare(Cosmetic a, Cosmetic b) {
        // Using Double.compare to compare double values (prices)
        return Double.compare(a.getPrice(), b.getPrice());
    }
}
