public class Item {
    private String name;
    private String type;
    private String size = "AVERAGE";
    private double price;

    // Constructor
    public Item(String name, String type, double price) {
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
        this.price = price;
    }

    // Returns the name, handling specific types like SIDE, DRINK, and TOPPING
    public String getName() {
        if (type.equals("SIDE") || type.equals("DRINK")) {
            return name + " " + size;
        }
        return name;
    }

    // Returns the base price
    public double getBasePrice() {
        return price;
    }

    // Adjusted price based on size (small, average, large)
    public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() * 0.5;
            case "LARGE" -> getBasePrice() * 1.75;
            default -> getBasePrice();
        };
    }

    // Sets the size (for sides or drinks)
    public void setSize(String size) {
        this.size = size;
    }

    // Prints the item with its name and price
    public static void printItem(String name, double price) {
        System.out.println(name + ": " + price);
    }

    // Prints the item using its name and adjusted price
    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
