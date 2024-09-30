public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(String name, double price) {
        // Call the parent class constructor (Item) with name, type, and price.
        super(name, "Burger", price);
    }

    @Override
    public String getName() {
        // Returns the name of the burger
        return super.getName() + " Burger";
    }

    @Override
    public double getAdjustedPrice() {
        // Calculate the price including extras if they are not null
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        // Return price based on topping name
        return switch (toppingName.toUpperCase()) {
            case "CHEESE", "LETTUCE", "MAYO" -> 1.0;
            case "HAM", "KETCHUP" -> 2.0;
            default -> 0.0;
        };
    }

    public void addToppings(String extra1, String extra2, String extra3) {
        // Add toppings with correct name handling
        this.extra1 = extra1.isEmpty() ? null : new Item(extra1, "TOPPING", getExtraPrice(extra1));
        this.extra2 = extra2.isEmpty() ? null : new Item(extra2, "TOPPING", getExtraPrice(extra2));
        this.extra3 = extra3.isEmpty() ? null : new Item(extra3, "TOPPING", getExtraPrice(extra3));
    }
    public void printItemizedList() {
        // Print the base burger price
        printItem("BASE BURGER", getBasePrice());

        // Print each extra topping if it exists
        if (extra1 != null) {
            extra1.printItem();
        }
        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

    @Override
    public void printItem() {
        // Print itemized list and a separator line
        printItemizedList();
        System.out.println("-".repeat(30));

        // Call the parent class's printItem method (which may print additional details)
        super.printItem();
    }
}
