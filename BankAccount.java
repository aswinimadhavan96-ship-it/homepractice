import java.util.Scanner;
class BankAccount
{

	Scanner sc=new Scanner(System.in);
	int balance;
	void initialBalance()
	{
		System.out.print("Enter the balance :");
		balance=sc.nextInt();
	}
	void deposit()
	{	
		
		System.out.println("Enter the amount to be deposite :");
		int amount=sc.nextInt();
		balance+=amount;
		System.out.println("Amount deposited balance="+balance);
	}
	void withdrawal()
	{
		
		System.out.println("Enter the amount to be withdrawal :");
		int amount=sc.nextInt();
		if(amount<=balance)
		{
			balance-=amount;
			System.out.println("Amount withdrawal balance="+balance);
		}else
				System.out.println("Insufficient Balance");
			
	}
	void display()
	{
		System.out.println("Account balance="+ balance);
		
	}
	public static void main(String [] args)
	{		
		Scanner bank=new Scanner(System.in);
		BankAccount account=new BankAccount();
		account.initialBalance();
		int choice;
		do
			{
            System.out.println("1. Enter deposit amount: ");
            System.out.println("2. Enter withdrawal amount: ");
			System.out.println("3.Display the balance: ");
            System.out.println("4. Exit");

		
			choice=bank.nextInt();	
			switch(choice)
			{
				case 1:
					account.deposit();
					break;
				case 2:
				
					account.withdrawal();
					break;
				case 3:
				
					account.display();
					break;
				case 4:
					System.out.println("----Exit-----");
					break;
			}
		}while(choice!=4);
			
		
					
			}
		}
	
	
	
	
	








