package atmsystem;

import java.util.Scanner;

public class ATMSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("========= ATM MENU ========");
            System.out.println("1. Withdraw Money");
            System.out.println("2. Check Account Balance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        System.out.print("Enter amount to withdraw: ");
                        double amount = sc.nextDouble();
                        atm.withdraw(amount);
                        break;

                    case 2:
                        atm.checkBalance();
                        break;

                    case 3:
                        System.out.println("Thank you for using ATM!");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }

            } catch (InsufficientBalanceException e) {
                System.out.println("Exception: " + e.getmessage());
            }

        } while (choice != 3);


    }
}
