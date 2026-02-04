import java.util.Scanner;

public class OnlineFoodOrderSystem
 {
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        FoodOrder order = null; 
        int choice;

        do {
            System.out.println("\n--- Online Food Order System ---");
            System.out.println("1. Place Order");
            System.out.println("2. View Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
			{
                case 1:
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Food Item: ");
                    String item = sc.nextLine();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();  

                    order = new FoodOrder(name, item, price);
                    order.placeOrder();
                    break;

                case 2:
                    if (order != null)
					{
                        order.showBill();
                    } else 
					{
                        System.out.println("\nNo order has been placed yet.");
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}
