import java.util.Scanner;
class Reversenumarray
{
	Scanner sc=new Scanner(System.in);
	int numbers[]=new int[10];
	
		void numbers()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Enter the numbers:");
				numbers[i]=sc.nextInt();
			}
		}
		void displaynumbers()
		{
			for(int i=0;i<10;i++)
			{
			System.out.print(numbers[i]+" ");
			}
			
		}
		void displayreversenumbers()
		{
			for(int i=9;i>=0;i--)
			{
				System.out.print(numbers[i]+" ");
			}
		}
		
			public static void main(String[] args)
		
		{
			Scanner sc=new Scanner(System.in);
			Reversenumarray obj=new Reversenumarray();
			int option;
		
			do
			{
				System.out.println("");
				System.out.println("1.Enter the numbers:");
				System.out.println("2.Display numbers");
				System.out.println("3.Display the reverse numbers");
				System.out.println("4.Exit");
				System.out.print("Enter the option:");
				option=sc.nextInt();
				switch(option)
				{
					case 1:
					{
						obj.numbers();
						break;
					}
					case 2:
					{
						obj.displaynumbers();
						break;
					}
					case 3:
					{
						obj.displayreversenumbers();
						break;
					}
					case 4:
					{
						break;
					}
					default:
						System.out.println("invalid option");
					
			}
		}while(option!=4);
		
	}
}