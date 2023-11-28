public class Cosmetic {
    private final String name;
    private final String color;
    private final double price;
    private final int quantity;
    private final String type;

    // Constructor
    public Cosmetic(String name, String color, double price, int quantity, String type) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        this.type = type;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Overriding toString method for convenient output
    @Override
    public String toString() {
        return String.format(
                "Cosmetic{name='%s', color='%s', price=%.2f, quantity=%d, type='%s'}",
                name, color, price, quantity, type);
    }
}