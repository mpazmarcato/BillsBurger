public class Main {
    public static void main(String[] args) {
        Item coke = new Item("Coke", "DRINK", 1.50);
        coke.printItem();
        coke.setSize("LARGE");
        coke.printItem();

        Burger burger = new Burger("Regular", 4.0);
        burger.addToppings("CHEESE", "", "KETCHUP");
        burger.printItem();

        MealOrder regularOrder = new MealOrder();
        regularOrder.addBurgerToppings("", "MAYO", "CHEES");
        regularOrder.setDrinkSize("SMALL");
        regularOrder.printItemizedList();

        MealOrder secondMealOrder = new MealOrder();
        secondMealOrder.addBurgerToppings("LETTUCE", "MAYO", "HAM");
        secondMealOrder.setDrinkSize("AVERAGE");
        secondMealOrder.printItemizedList();

    }
}