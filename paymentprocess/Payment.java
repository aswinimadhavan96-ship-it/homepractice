package paymentprocess;

public abstract class Payment implements Runnable{

    protected double amount;
    public Payment(double amount){
        this.amount=amount;
    }
    public abstract void processPayment();
    @Override
        public void run(){
        processPayment();
    
        }
}
