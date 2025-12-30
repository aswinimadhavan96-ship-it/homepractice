import java.util.Scanner;
class Agecategory
{
	public static void main(String[] args)
	{
		System.out.println("Age category:");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		{
		if(age>0&&age<13)
			System.out.println("Child");
		else if(age>=13&&age<=19)
			System.out.println("Teenager");
		else if(age>=20&&age<=59)
			System.out.println("Adult");
		else if(age>=60)
			System.out.println("Senior");
		else
			System.out.println("invalid input");
	
		
		}
	}	
	
}