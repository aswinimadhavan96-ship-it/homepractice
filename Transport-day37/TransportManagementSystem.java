import java.util.Scanner;
public class TransportManagementSystem {

    static Scanner sc = new Scanner(System.in);
    static Transport transport = null;

    static void selectRoute(Transport t) {
        System.out.println("\nSelect Route:");
        System.out.println("1. Chennai -> Bangalore");
        System.out.println("2. Chennai -> Coimbatore");
        System.out.println("3. Chennai -> Madurai");
        System.out.println("4. Chennai -> Trichy");
        System.out.println("5. Chennai -> Salem");
        System.out.print("Enter route choice: ");
        int route = sc.nextInt();

        t.fromCity = "Chennai";

        switch (route) {
            case 1:
                t.toCity = "Bangalore";
                t.distance = 350;
                break;
            case 2:
                t.toCity = "Coimbatore";
                t.distance = 500;
                break;
            case 3:
                t.toCity = "Madurai";
                t.distance = 460;
                break;
            case 4:
                t.toCity = "Trichy";
                t.distance = 330;
                break;
            case 5:
                t.toCity = "Salem";
                t.distance = 340;
                break;
            default:
                System.out.println("Invalid Route Selection");
        }
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n---- TRANSPORT MANAGEMENT SYSTEM ----");
            System.out.println("1. City Bus Booking");
            System.out.println("2. Luxury Bus Booking");
            System.out.println("3. Calculate Fare");
            System.out.println("4. Display Ticket");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    transport = new CityBus();
                    System.out.print("Enter Passenger ID: ");
                    transport.passengerId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    transport.passengerName = sc.nextLine();
                    selectRoute(transport);
                    System.out.println("Ticket Booked Successfully");
                    break;

                case 2:
                    transport = new LuxuryBus();
                    System.out.print("Enter Passenger ID: ");
                    transport.passengerId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    transport.passengerName = sc.nextLine();
                    selectRoute(transport);
                    System.out.println("Ticket Booked Successfully");
                    break;

                case 3:
                    if (transport != null) {
                        transport.calculateFare();
                        System.out.println("Fare Calculated Successfully");
                    } else {
                        System.out.println("Please book a ticket first");
                    }
                    break;

                case 4:
                    if (transport != null) {
                        transport.displayTicket();
                    } else {
                        System.out.println("No ticket to display");
                    }
                    break;

                case 5:
                    System.out.println("Thank You for Using Transport Management System");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
