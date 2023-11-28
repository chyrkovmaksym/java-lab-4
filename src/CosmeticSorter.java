import java.util.Arrays;
import java.util.Comparator;

public class CosmeticSorter {

    // Sorting in ascending order by the "name" field
    public static Cosmetic[] sortByName(Cosmetic[] source) {
        Cosmetic[] clone = source.clone();

        Arrays.sort(clone, new SortByName());

        return clone;
    }

    // Sorting in descending order by the "price" field

    public  static Cosmetic[] sortByPrice(Cosmetic[] source){
        Cosmetic[] clone = source.clone();

        Arrays.sort(clone, new SortByPrice().reversed());

        return clone;
    }

    // Executive method
    public void performSorting() {
        // Creating an array of Cosmetic objects
        Cosmetic[] cosmeticArray = new Cosmetic[]{
                new Cosmetic("Lipstick", "Red", 15.99, 30, "Matte"),
                new Cosmetic("Mascara", "Black", 12.49, 20, "Waterproof"),
                new Cosmetic("Foundation", "Ivory", 25.99, 15, "Liquid"),
                new Cosmetic("Eyeshadow", "Neutral", 18.99, 25, "Powder"),
                new Cosmetic("Blush", "Pink", 14.99, 18, "Compact")
        };

        Cosmetic[] sortedByName = sortByName(cosmeticArray);

        // Output the results of sorting
        System.out.println("Sorting by name (ascending):");
        printCosmetics(sortedByName);

        Cosmetic[] sortedByPrice = sortByPrice(cosmeticArray);

        // Output the results of sorting
        System.out.println("\nSorting by price (descending):");
        printCosmetics(sortedByPrice);
    }

    // Output information about cosmetics
    public static void printCosmetics(Cosmetic[] cosmetics) {
        for (Cosmetic cosmetic : cosmetics) {
            System.out.println(cosmetic);
        }
    }
}