import java.util.Scanner;
class Trafic
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	{
		System.out.print("Print the color: ");
		String color=sc.nextLine();
		switch(color)
		{
		case "Green"->
				System.out.println("Go");
		case "Yellow"->
				System.out.println("Get ready");
		case "Red"->
				System.out.println("Stop");
					
		default->
				System.out.println("Invalid");
				
		}
	}
	}
}