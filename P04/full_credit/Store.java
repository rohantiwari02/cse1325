import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    static ArrayList<Product> products = new ArrayList<>();
    static ArrayList<Product> shoppingCart = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Taxfree("Milk", 3.99));
        products.add(new Taxfree("Bread", 1.49));
        products.add(new Taxfree("Cheese", 2.99));
        products.add(new Taxfree("Eggs", 5.99));
        products.add(new Taxed("Poptarts", 1.99));
        products.add(new Taxed("Donuts", 1.49));
        products.add(new Taxed("Ice Cream", 3.99));
        products.add(new Taxed("Cheetos", 2.39));
    
        
        ArrayList<Product> shoppingCart = new ArrayList<>();
    
        
        Scanner scanner = new Scanner(System.in);
        int itemNumber = 0;
        while (itemNumber >= 0) {
            System.out.println("=======================");
            System.out.println(" Welcome to the Store");
            System.out.println("=======================");
            System.out.println("");
            for (Product item : products) {
                if (item instanceof Taxfree) {
                    System.out.println((products.indexOf(item) + 1) + ". " + item);
                }
            }
            
            for (Product item : products) {
                if (item instanceof Taxed) {
                    System.out.println((products.indexOf(item) + 1) + ". " + item);
                }
            }
    
            if (!shoppingCart.isEmpty()) {
                System.out.println("");
                System.out.println("Current Order");
                System.out.println("-------------");
                System.out.println("");
                for (Product item : shoppingCart) {
                    System.out.println("- " + item);
                }
                double totalPrice = 0.0;
                    for (Product item : shoppingCart) {
                        totalPrice += item.price();
                    }
                    System.out.printf("Total price: $%.2f\n", totalPrice);
            }

            System.out.println("Buy which product? (negative to exit): ");
            try {
                itemNumber = Integer.parseInt(scanner.nextLine()) - 1;
                if (itemNumber >= 0 && itemNumber < products.size()) {
                    Product selectedItem = products.get(itemNumber);
                    shoppingCart.add(selectedItem);
                    System.out.println("Added " + selectedItem.name + " to shopping cart.");
                    System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid item number: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
  
        double totalPrice = 0.0;
        for (Product item : shoppingCart) {
            totalPrice += item.price();
        }
        System.out.println("Total price: $" + String.format("%.2f", totalPrice));
        scanner.close();
    }

}
