package mobileshop;

public class mobshop {

    Node head;


    public void insertAtHead(int id, String brand, double price) {
        Node newNode = new Node(id, brand, price);
        newNode.next = head;
        head = newNode;
        System.out.println("Latest Launch Mobile Added Successfully!");
    }


    public void insertAtTail(int id, String brand, double price) {
        Node newNode = new Node(id, brand, price);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        System.out.println("Regular Stock Mobile Added Successfully!");
    }

    public void display() {
        if (head == null) {
            System.out.println("No Mobiles Available in Shop!");
            return;
        }

        Node temp = head;

        System.out.println("\nAvailable Mobiles:");
        System.out.println("---------------------------------");

        while (temp != null) {
            System.out.println("Mobile ID : " + temp.mobileId);
            System.out.println("Brand     : " + temp.brandName);
            System.out.println("Price     : " + temp.price);
            System.out.println("---------------------------------");
            temp = temp.next;
        }
    }
}

