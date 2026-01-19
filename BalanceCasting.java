import java.util.Scanner;
class BalanceCasting
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("--------wrong casting balance--------");
		System.out.print("enter balance :");
		double balance=obj.nextDouble();
		System.out.print("enter withdrawal amount :");
		float withdrawal=obj.nextFloat();
		double balanceAfterWithdrawal=((int)balance-(int)withdrawal);
		System.out.println("Balance Afer Withdrawal :"+balanceAfterWithdrawal);
		System.out.println("--------correct casting balance--------");
		double cBalanceAfterWithdrawal=balance-(int)withdrawal;
		System.out.println("Balance Afer Withdrawal :"+cBalanceAfterWithdrawal);
	}
}