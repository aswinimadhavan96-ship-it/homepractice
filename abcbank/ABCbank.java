package abcbank;
import java.util.Scanner;
public class ABCbank {
    static final String BANK_NAME = "ABC Bank";
    static final double INTEREST_RATE = 7.5;


    static double calculateInterest(double principal, int years) {
    double interest = (principal * INTEREST_RATE * years) / 100;
    return interest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter number of years: ");
        int years = sc.nextInt();

        double interest = calculateInterest(principal, years);

        System.out.println("Bank Name: " + BANK_NAME);
        System.out.println("Principal Amount: " + principal);
        System.out.println("Years: " + years);
        System.out.println("Interest Amount: " + interest);

       
    }
}

    

