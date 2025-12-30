import java.util.Scanner;
class Ebcalculation
{
	public static void main(String[] args)
	{
		System.out.println("Electricity charges calculation");
		System.out.print("Enter the units : ");
		Scanner sc=new Scanner(System.in);
		int units=sc.nextInt();
		double amount;
		
		if(units<=100&&units>0)
		{	
			amount=units*5;
			System.out.println("Electricity Bill:Rs."+amount);
		}	
		else if(units>=101&&units<=200)
		{
			amount=units*7;
			System.out.println("Electricity Bill:Rs."+amount);
		}
		else if(units>200)
		{	
			amount=units*10;
			System.out.println("Electricity Bill:Rs."+amount);
		}
		else
			System.out.println("sorry invalid");
		
	}
}