class Markevaluation
{
	int add(int a,int b, int c)
	{
		int d=a+b+c;
		return d;
	}
	int m(int a,int b,int c)
	{
		int d=((a+b+c)/3);
		return d;
	}

	public static void main(String[] args)
	{
		Markevaluation mar=new Markevaluation();
		int total=mar.add(80,68,50);
		int per=mar.m(80,68,50);
		
		System.out.println("Total Marks= "+total);
		System.out.println("percentage= "+per);
		if(per>=40)
		{
			System.out.println("The student is Pass");
		}
		else 
		{
			System.out.println("The student is Fail");
		}
		if(per>=75)
			System.out.println("A grade");
		else if(per<=74&&per>=60)
			System.out.println("B grade");
		else if(per<=59&&per>=40)
			System.out.println("C grade");
		else 
			System.out.println("ABSENT");
		
			
		
			
			
		}
}