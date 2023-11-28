import java.util.Comparator;

/**
 * A comparator class for sorting Cosmetic objects based on their names in ascending order.
 */
public class SortByName implements Comparator<Cosmetic> {
    @Override
    public int compare(Cosmetic a, Cosmetic b){
        return  a.getName().compareTo(b.getName());
    }
}
