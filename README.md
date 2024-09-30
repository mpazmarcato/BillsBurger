# BillsBurger Java Project

BillsBurger is a simple Java-based system for handling meal orders at a burger restaurant. The project includes classes for items, burgers, and full meal orders, allowing users to customize burgers with additional toppings and adjust prices based on size. It demonstrates object-oriented programming principles such as inheritance, encapsulation, and method overriding.

## Project Structure

### Classes Overview:

1. **Item Class:**
   - Represents a generic menu item (e.g., a side, drink, or topping).
   - Contains attributes like `name`, `type`, `size`, and `price`.
   - Methods:
     - `getName()`: Returns the name of the item. Adds size information for sides and drinks.
     - `getBasePrice()`: Returns the base price of the item.
     - `getAdjustedPrice()`: Adjusts the price based on the size of the item (e.g., "SMALL" or "LARGE").
     - `setSize(String size)`: Sets the size of the item (for sides or drinks).
     - `printItem()`: Prints the item name and adjusted price.

2. **Burger Class (Extends Item):**
   - Represents a burger with optional toppings.
   - Inherits from `Item`, adding specific functionality for burgers.
   - Methods:
     - `addToppings(String extra1, String extra2, String extra3)`: Adds up to three toppings to the burger.
     - `getAdjustedPrice()`: Calculates the price of the burger, including any added toppings.
     - `printItemizedList()`: Prints the burger base price and any toppings added.

3. **MealOrder Class:**
   - Manages a full meal order, consisting of a burger, drink, and side.
   - Methods:
     - `addBurgerToppings(String extra1, String extra2, String extra3)`: Adds toppings to the burger.
     - `getTotalAmount()`: Returns the total price for the meal (burger, drink, and side).
     - `printItemizedList()`: Prints a detailed breakdown of the meal order.
     - `setDrinkSize(String drinkSize)`: Sets the size for the drink.

## Features

- **Create custom burgers**: Users can create a burger with up to three extra toppings.
- **Adjust prices based on item size**: Drinks and sides can have their prices adjusted based on size (e.g., "SMALL" or "LARGE").
- **Meal management**: Complete a meal order with a burger, drink, and side, and print an itemized list of the total cost.

## How to Run the Project
- Clone the repository:
```bash
git clone https://github.com/your-username/billsburger.git
```
- Compile the Java classes:
```bash
javac *.java
```
- Run the program:
```bash
java Main
```
