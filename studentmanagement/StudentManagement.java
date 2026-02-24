package studentmanagement;
import java.util.*;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> studentIds = new HashSet<>();
        Map<Integer, String> studentMap = new HashMap<>();

        int choice;

        do {
            System.out.println("\n STUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add student");
            System.out.println("2. Remove student");
            System.out.println("3. Searching student");
            System.out.println("4. Display Students");
            System.out.println("5. Display total students");
            System.out.println("6. EXIT");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter student ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (studentIds.contains(id)) {
                        System.out.println("Student ID already exists");
                    } else {
                        System.out.println("Enter student name:");
                        String name = sc.nextLine();
                        studentIds.add(id);
                        studentMap.put(id, name);
                        System.out.println("Student added successfully");
                    }
                    break;

                case 2:
                    System.out.println("Enter student ID to remove:");
                    int removeId = sc.nextInt();

                    if (studentIds.contains(removeId)) {
                        studentIds.remove(removeId);
                        studentMap.remove(removeId);
                        System.out.println("Student removed successfully");
                    } else {
                        System.out.println("Student ID not found");
                    }
                    break;

                case 3:
                    System.out.println("Enter student ID to search:");
                    int searchId = sc.nextInt();

                    if (studentMap.containsKey(searchId)) {
                        System.out.println("Student name: " + studentMap.get(searchId));
                    } else {
                        System.out.println("Student ID not found");
                    }
                    break;

                case 4:
                    if (studentMap.isEmpty()) {
                        System.out.println("No students available");
                    } else {
                        System.out.println("Students Details:");
                        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
                            System.out.println("ID: " + entry.getKey() +
                                               " Name: " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total students: " + studentIds.size());
                    break;

                case 6:
                    System.out.println("Exit. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);

     }
}