package emailvalidator;
import java.util.Scanner;
public class EmailValidator {

    public static void main(String[] args) {

    System.out.println("Enter Mail ID: " );
    Scanner sc=new Scanner(System.in);
    String email=sc.nextLine();
    int atIndex=email.indexOf("@");
    int dotIndex=email.indexOf(".");
    if (atIndex > 0 && dotIndex > atIndex){
    System.out.println("Valid Email");
    
    
    }else{
    System.out.println("Invalid Email");
    }
        
            
}

    }
    

