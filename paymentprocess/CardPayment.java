package paymentprocess;

public class CardPayment extends Payment {
    public CardPayment(double amount){
            super(amount);
    }
    @Override
    public void processPayment(){
        try{
            Thread.sleep(1000);
            
        }catch(InterruptedException e)
        {
            System.out.println("e");
            
        }
        System.out.println("Card Payment of"+amount+"Complited");
    }
           
}

