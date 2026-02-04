public class FoodOrder extends Customer implements Order
 {
    private String foodItem;
    private double price;
    private boolean orderPlaced;


    public FoodOrder(String customerName, String foodItem, double price) {
        super(customerName);
        this.foodItem = foodItem;
        this.price = price;
        this.orderPlaced = false;
    }


    @Override
    public void placeOrder()
	{
        orderPlaced = true;
        System.out.println("\nOrder placed successfully!");
    }

    @Override
    public void showBill()
	{
        if (orderPlaced)
		{
            System.out.println("\n----- Bill -----");
            System.out.println("Customer: " + customerName);
            System.out.println("Food Item: " + foodItem);
            System.out.println("Price: Rs." + price);
            System.out.println("----------------");
        } 
		else 
		{
            System.out.println("\nNo order has been placed yet.");
        }
    }
}
