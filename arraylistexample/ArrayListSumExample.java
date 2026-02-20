package arraylistexample;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSumExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        int choice;
        
        while (true) {
            System.out.println("1 for Entry 2 for exit");
            choice = sc.nextInt();
            
            if (choice == 1) {
                System.out.println("Enter the value");
                int value = sc.nextInt();
                numbers.add(value);
            } 
            else if (choice == 2) {
                break;
            } 
            else {
                System.out.println("Invalid choice");
            }
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum of the values you have entered " + sum);
        
        sc.close();
    }
}