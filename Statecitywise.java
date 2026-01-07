import java.util.Scanner;
class Statecitywise
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of state :");
		int row=sc.nextInt();
		System.out.print("Enter the number of city in per state :");
		int col=sc.nextInt();
		sc.nextLine();
		String city[][]=new String[row][col];
		for(int i=0;i<city.length;i++)
		{
			System.out.println("**************************** ");
			for(int j=0;j<city[i].length;j++)
			{
				System.out.print("Enter the name of Cities"+" "+(j+1)+" in "+"state "+(i+1)+" :");
				city[i][j]=sc.nextLine();
			}
		}
		System.out.println("*********City Namess********* ");
		for(int i=0;i<city.length;i++)
		{
			for(int j=0;j<city[i].length;j++)
			{
				System.out.printf("%-15s",(city[i][j]));
			}
			System.out.println();
		}
	}
}