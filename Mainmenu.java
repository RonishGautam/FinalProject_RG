import java.util.ArrayList;
import java.util.Scanner;

public class Mainmenu {
    public static void main(String[] args) {
    	Entree<String> steak = new Entree<String>("12", "Steak", "Grilled to perfection.");
        Entree<Double> chicken = new Entree<Double>(9.0, "Chicken", "A juicy grilled chicken breast.");

        Dessert<Double> cake = new Dessert<>(7.99, "Cake", "A slice of delicious chocolate cake.");
        Dessert<Double> iceCream = new Dessert<>(5.0, "Ice Cream", "A scoop of creamy vanilla ice cream.");

        Drink<Double> soda = new Drink<Double>(2.8, "Coke", "Small");
        Drink<Double> juice = new Drink<Double>(3.5, "Juice", "Freshly squeezed orange juice.");
        Drink<Double> milk = new Drink<Double>(3.0, "Milk", "A glass of cold milk.");
        Drink<Double> tea = new Drink<Double>(2.5, "Tea", "Hot or iced.");

        Entree<Integer> burger = new Entree<Integer>(8, "Burger", "A classic beef burger.");
        Entree<Integer> hotdog = new Entree<Integer>(6, "Hot Dog", "A juicy all-beef hot dog.");

        Entree<Double> pizza = new Entree<Double>(10.0, "Pizza", "A delicious 12-inch pizza with your choice of toppings.");

        SpecialOffer special = new SpecialOffer<Double>(20.99, "Special Offer", "A combo meal with steak, pasta, and soda.");

        Entree<Double> salmon = new Entree<Double>(15.99, "Salmon", "A perfectly grilled salmon fillet.");
        Entree<Double> shrimp = new Entree<Double>(12.99, "Shrimp", "A plate of garlic butter shrimp.");
        Entree<Double> pasta = new Entree<Double>(11.99, "Pasta", "Your choice of pasta with red or white sauce.");

        Dessert<Double> pie = new Dessert<Double>(8.99, "Pie", "A slice of freshly baked apple pie.");
        Dessert<Double> cheesecake = new Dessert<Double>(9.99, "Cheesecake", "A slice of creamy cheesecake with strawberry topping.");

        Drink<Double> beer = new Drink<Double>(5.99, "Beer", "A cold bottle of beer.");
        Drink<Double> wine = new Drink<Double>(8.99, "Wine", "A glass of your favorite wine.");

        // Create menu
        Menu menu = new Menu();

        menu.addItem(steak);
        menu.addItem(chicken);
        menu.addItem(cake);
        menu.addItem(iceCream);
        menu.addItem(soda);
        menu.addItem(juice);
        menu.addItem(milk);
        menu.addItem(tea);
        menu.addItem(burger);
        menu.addItem(hotdog);
        menu.addItem(pizza);
        menu.addItem(special);
        menu.addItem(salmon);
        menu.addItem(shrimp);
        menu.addItem(pasta);
        menu.addItem(pie);
        menu.addItem(cheesecake);
        menu.addItem(beer);
        menu.addItem(wine);

        // Print menu items and prices
        System.out.println("Menu:");
        for (int i = 0; i < menu.getSize(); i++) {
            MenuItem item = menu.getItem(i);
            System.out.println((i + 1) + ". " + item.getName() + ": $" + item.getPrice());   
            System.out.println("      " + item.getDescription());
            System.out.println();
        }
        

        // Prompt user to order items
        Scanner scanner = new Scanner(System.in);
        ArrayList<MenuItem<Double>> orderItems = new ArrayList<>();
        boolean finished = false;

        while (!finished) {
            System.out.print("Enter the number of an item to order (or 0 to finish): ");
            int number = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            if (number == 0) {
                finished = true;
            } else if (number > 0 && number <= menu.getSize()) {
                orderItems.add(menu.getItem(number - 1));
            } else {
                System.out.println("Invalid choice that option is not in the menu.");
            }
        }

        // Calculate total cost including tax
        double subtotal = 0;
        for (MenuItem<Double> item : orderItems) {
            if (item.getPrice() instanceof Number) {
                subtotal += ((Number) item.getPrice()).doubleValue();
            }
        }

        double tax = subtotal * 0.06; // 6% tax rate
        double total = subtotal + tax;

        // Print order summary
        System.out.println("Order summary:");
        for (MenuItem<Double> item : orderItems) {
            System.out.println(item.getName() + ": $" + item.getPrice());
        }
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        
        System.out.print("Do you want to start a new order? (Y/N): ");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            main(args); // restart the program
        } else {
            System.out.println("Thank you for your order!");
        }
    }// end main
}//end Mainmenu
