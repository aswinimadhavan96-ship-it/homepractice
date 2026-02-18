package paymentprocess;

public class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void processPayment() {
        try{
            Thread.sleep(1000);
            
        }catch(InterruptedException e){
            System.out.println("e");
        }
        System.out.println("UPI payment of " + amount + " completed");
    }
}
