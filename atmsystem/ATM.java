package atmsystem;

public class ATM {
    private double balance=5000;
    public void withdraw(double amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance. Available balance is :" +balance);
        }
            balance=balance-amount;
            System.out.println("Witthdrawal successflly!!");
            System.out.println("Remaining balance :"+balance);
            
        
    }
      public void checkBalance(){
            System.out.println("Current Balance: "+balance);
            
}
}
