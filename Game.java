import java.util.Scanner;
class Game
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("--------wrong casting score--------");
		System.out.print("enter player score :");
		long game=obj.nextLong();
		System.out.print("enter time taken by the player :");
		double time=obj.nextDouble();
		int rank=(int)game/(int)time;
		System.out.println("Rank ="+rank);
		System.out.println("--------correct casting score--------");
		int cRank=(int)(game/time);
		System.out.println("Rank ="+cRank);
	}
}