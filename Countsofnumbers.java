import java.util.Scanner;
class Countsofnumbers 	
{
	Scanner sc=new Scanner(System.in);
	int numbers[]=new int[10];
	int positivecount=0;
	int negativecount=0;
	int zerocount=0;
	void numbers()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Enter the numbers");
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
	void countpositivenumbers()
	{
		for(int i=0;i<10;i++)
		{
			if(numbers[i]>0)
			{
				System.out.println(numbers[i]+"is positive number");
				positivecount++;
			}
		}
		
	}
	void positivecount()
	{
		
		countpositivenumbers();
		System.out.println(positivecount);
	}
	void countnegativenumbers()
	{
		for(int i=0;i<10;i++)
		{
			if(numbers[i]<0)
			{
				System.out.println(numbers[i]+"is negative number");
				negativecount++;
			}
		}
		
	}
	void negativecount()
	{
		countnegativenumbers();
		System.out.println(negativecount);
	}
	void countzeros()
	{
		for(int i=0;i<10;i++)
		{
			if(numbers[i]==0)
			{
				System.out.println(numbers[i]+"is zero");
				zerocount++;
			}
		}
		
	}
	void zerocount()
	{
		countzeros();
		System.out.println(zerocount);
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Countsofnumbers obj=new Countsofnumbers();
		int option;
		do
			{
				System.out.println("");
				System.out.println("1.Enter the numbers");
				System.out.println("2.Display numbers");
				System.out.println("3.count positive numbers");
				System.out.println("4.count negative numbers");
				System.out.println("5.count zeros");
				System.out.println("6.Exit");
				System.out.println("Enter the option:");
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
						obj.positivecount();
						break;
					}
					case 4:
					{
						obj.negativecount();
						break;
					}
					case 5:
					{
						obj.zerocount();
						break;
					}
					case 6:
					{
						break;
					}
					default:
						System.out.println("invalid option");
					
			}
		}while(option!=6);
		
	}
}