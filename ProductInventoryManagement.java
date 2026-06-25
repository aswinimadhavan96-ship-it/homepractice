
package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductInventoryManagement {

    public static void main(String[] args) {

        HashMap<String, Integer> products = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- PRODUCT INVENTORY MANAGEMENT ---");
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Update Quantity");
            System.out.println("4. Delete Product");
            System.out.println("5. Display All Products");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clears Enter key

            switch (choice) {

                case 1:
                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    products.put(productName, quantity);

                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Product Name to Search: ");
                    String searchName = sc.nextLine();

                    if (products.containsKey(searchName)) {
                        System.out.println("Product: " + searchName);
                        System.out.println("Quantity: " + products.get(searchName));
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Product Name to Update: ");
                    String updateName = sc.nextLine();

                    if (products.containsKey(updateName)) {
                        System.out.print("Enter New Quantity: ");
                        int newQuantity = sc.nextInt();

                        products.put(updateName, newQuantity);

                        System.out.println("Quantity updated successfully!");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product Name to Delete: ");
                    String deleteName = sc.nextLine();

                    if (products.containsKey(deleteName)) {
                        products.remove(deleteName);

                        System.out.println("Product deleted successfully!");
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 5:
                    if (products.isEmpty()) {
                        System.out.println("No products available!");
                    } else {
                        System.out.println("\n ******ALL PRODUCTS****");

                        for (Map.Entry<String, Integer> entry : products.entrySet()) {
                            System.out.println(
                                "Product Name: " + entry.getKey()
                                + " | Quantity: " + entry.getValue()
                            );
                        }
                    }
                    break;

                case 6:
                    System.out.println("Thank you!!!!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}