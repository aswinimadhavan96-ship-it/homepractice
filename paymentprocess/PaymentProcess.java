package paymentprocess;

public class PaymentProcess {
        
    public static void main(String[] args) {
        double cardAmount=2000;
        double upiAmount=1500;
        
        Payment card=new CardPayment(cardAmount);
        Payment upi=new UPIPayment(upiAmount);
        
        Thread t1=new Thread(card);
        Thread t2=new Thread(upi);
        
                
        t1.start();
        t2.start();
    }
    
}
