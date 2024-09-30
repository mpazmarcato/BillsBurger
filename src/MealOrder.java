public class MealOrder {
    private Burger burger;
    private Item drink;
    private Item side;

    public MealOrder() {
        this("Regular", "Coke", "Fries");
    }

    public MealOrder(String burgerType, String drinkType, String sideType) {
        this.burger = new Burger(burgerType, 4.0);
        this.drink = new Item(drinkType, "drink",1.00);
        this.side = new Item(sideType, "side",1.50);;
    }

    public void addBurgerToppings(String extra1, String extra2, String extra3){
        burger.addToppings(extra1, extra2, extra3);
    }

    public double getTotalAmount(){
        return burger.getAdjustedPrice() + drink.getAdjustedPrice() + side.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItemizedList();
        drink.printItem();
        side.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL: ", getTotalAmount());
    }

    public void setDrinkSize (String drinkSize) {
        drink.setSize(drinkSize);
    }
}
