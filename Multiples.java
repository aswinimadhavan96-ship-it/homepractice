import java.util.Scanner;
class Multiples
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		{
		if(n%3==0)
			System.out.println("Multiple of 3");
		else if(n%7==0)
			System.out.println("Multiple of 7");
		else
			System.out.println("Not a Multiple of 3 or 7");
		}
		
	}
	
	
	
	
	
}