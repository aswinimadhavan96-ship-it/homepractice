package map;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryBookManagement {

    public static void main(String[] args) {

        HashMap<Integer, String> books = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- LIBRARY BOOK MANAGEMENT SYSTEM ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Update Book Details");
            System.out.println("4. Remove Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title: ");
                    String bookTitle = sc.nextLine();

                    books.put(bookId, bookTitle);

                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    System.out.print("Enter Book ID to Search: ");
                    int searchId = sc.nextInt();

                    if (books.containsKey(searchId)) {
                        System.out.println("Book ID: " + searchId);
                        System.out.println("Book Title: " + books.get(searchId));
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    if (books.containsKey(updateId)) {
                        System.out.print("Enter New Book Title: ");
                        String newTitle = sc.nextLine();

                        books.put(updateId, newTitle);

                        System.out.println("Book details updated successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID to Remove: ");
                    int removeId = sc.nextInt();

                    if (books.containsKey(removeId)) {
                        books.remove(removeId);
                            System.out.println("Book removed successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;

                case 5:
                    if (books.isEmpty()) {
                        System.out.println("No books available!");
                    } else {
                        System.out.println("\n--- ALL BOOKS ---");

                        for (Map.Entry<Integer, String> entry : books.entrySet()) {
                            System.out.println(
                                "Book ID: " + entry.getKey()
                                + " | Book Title: " + entry.getValue()
                            );
                        }
                    }
                    break;

                case 6:
                    System.out.println("Program closed!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);    }
}
