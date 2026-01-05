class Star
{
	public static void main(String[]args)
	{
		for(int i=1;i<=4;i++)
		{
			for(int sp=3;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2-1);j++)
			{
				System.out.print("*");					
			}											 
				System.out.println();						 					
			}												 
			for(int i=1;i<=3;i++)							 
			{												   
			for(int rs=1;rs<=i;rs++)							
			{
				System.out.print(" ");
			}
			for(int j=5;j>=(i*2-1);j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}