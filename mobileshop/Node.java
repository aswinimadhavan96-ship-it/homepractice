package mobileshop;
class Node {
    int mobileId;
    String brandName;
    double price;
    Node next;

    // Constructor
    public Node(int mobileId, String brandName, double price) {
        this.mobileId = mobileId;
        this.brandName = brandName;
        this.price = price;
        this.next = null;
    }
}
