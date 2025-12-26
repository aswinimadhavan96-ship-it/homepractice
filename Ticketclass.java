import java.util.Scanner;
class Ticketclass
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Seat Type: ");
		
		int seat=sc.nextInt();
		switch(seat)
		{
		case 1->
			System.out.println("General=45");
		case 2->
			System.out.println("Sleeper=85");
		case 3->	
			System.out.println("AC3 Tier=125");
		case 4->	
			System.out.println("AC2 Tier=180");
		case 5->	
			System.out.println("First Class=250");
		default ->
			System.out.println("Sorry Seat unavailable");
		










		
		}
	
	
	}
}