import java.util.Scanner;
class Evaluationofgrade
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	{
		System.out.print("Print the Grade: ");
		char grade=sc.next().charAt(0);
		switch(grade)
		{
		case'A'->
				System.out.println("Excellent");
		case'B'->
				System.out.println("Good");
		case'C'->
				System.out.println("Fair");
		case'D'->
				System.out.println("Need Improvement");
		case'F'->
				System.out.println("Fail");
		default->
				System.out.println("Very poor");
				
		}
	}
	}
}