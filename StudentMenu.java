package student.record;
import java.sql.*;
import java.util.Scanner;

public class StudentMenu {
    static final String URL ="jdbc:postgresql://localhost:5432/StudentRecord";
    static final String USER ="postgres";
    static final String PASSWORD = "jasvik"; 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to PostgreSQL Successfully!");

            int choice;

            do {
                System.out.println("\n1.Insert");
                System.out.println("2.Display");
                System.out.println("3.Update");
                System.out.println("4.Delete");
                System.out.println("5.Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Grade: ");
                        String grade = sc.nextLine();

                        PreparedStatement psInsert = con.prepareStatement(
                                "INSERT INTO student VALUES (?, ?, ?, ?)");
                        psInsert.setInt(1, id);
                        psInsert.setString(2, name);
                        psInsert.setInt(3, age);
                        psInsert.setString(4, grade);

                        psInsert.executeUpdate();
                        System.out.println("Record Inserted!");
                        break;

                    case 2:
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

                        System.out.println("ID  Name  Age  Grade");
                        while (rs.next()) {
                            System.out.println(
                                    rs.getInt("id") + "  " +
                                    rs.getString("name") + "  " +
                                    rs.getInt("age") + "  " +
                                    rs.getString("grade")
                            );
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to Update: ");
                        int uid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine();

                        PreparedStatement psUpdate = con.prepareStatement(
                                "UPDATE student SET name=? WHERE id=?");
                        psUpdate.setString(1, newName);
                        psUpdate.setInt(2, uid);

                        psUpdate.executeUpdate();
                        System.out.println("Record Updated!");
                        break;

                    case 4:
                        System.out.print("Enter ID to Delete: ");
                        int did = sc.nextInt();

                        PreparedStatement psDelete = con.prepareStatement(
                                "DELETE FROM student WHERE id=?");
                        psDelete.setInt(1, did);

                        psDelete.executeUpdate();
                        System.out.println("Record Deleted!");
                        break;

                    case 5:
                        System.out.println("Program Ended!");
                        break;

                    default:
                        System.out.println("Invalid Choice!");
                }

            } while (choice != 5);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}