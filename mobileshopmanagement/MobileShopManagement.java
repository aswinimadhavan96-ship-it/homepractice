package mobileshopmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileShopManagement {
 
    static class Mobile {
        private int mobileId;
        private String brandName;
        private double price;

         public Mobile(int mobileId, String brandName, double price) {
            this.mobileId = mobileId;
            this.brandName = brandName;
            this.price = price;
        }

         public int getMobileId() {
            return mobileId;
        }

        public String getBrandName() {
            return brandName;
        }

        public double getPrice() {
            return price;
        }

 
        public void display() {
            System.out.println("Mobile ID: " + mobileId);
            System.out.println("Brand Name: " + brandName);
            System.out.println("Price: " + price);
            System.out.println("---------------------------");
        }
    }

     public static void main(String[] args) {

        ArrayList<Mobile> mobileList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n********** MOBILE SHOP MENU *********");
            System.out.println("1. Add Mobile");
            System.out.println("2. View All Mobiles");
            System.out.println("3. Search Mobile by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Mobile ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Brand Name: ");
                    String brand = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    Mobile m = new Mobile(id, brand, price);
                    mobileList.add(m);

                    System.out.println("Mobile Added Successfully!");
                    break;

                case 2:
                    if (mobileList.isEmpty()) {
                        System.out.println("No Mobiles Available.");
                    } else {
                       for (int i = 0; i < mobileList.size(); i++) {
                            mobileList.get(i).display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Mobile ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (Mobile mob : mobileList) {
                        if (mob.getMobileId() == searchId) {
                            mob.display();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mobile Not Found");
                    }
                    break;

                case 4:
                    System.out.println("Exiting Program..");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

    }
}