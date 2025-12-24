class Scolarship

{
	public static void main(String[] args)
	{
		int marks=85;
		boolean attendance=true;
		boolean discipline=true;
		System.out.println("Pass & eligible for scholarship:");
		System.out.println((attendance==discipline)&&(attendance!=discipline)||(attendance==discipline));
	}
}