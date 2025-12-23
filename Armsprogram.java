class Armsprogram
{
	public static void main(String[] args)
	{
		int a=1453;
		int b=a%10;
		int c=a/10;
		int d=c%10;
		int e=c/10;
		int f=(e*e*e*e)+(d*d*d*d)+(b*b*b*b);
		boolean g=(a==f);
		System.out.println(g);

	}
}