import java.util.Scanner;

class StudentProcess
 {
    String name;
    int rollNo;

    void getDetails() 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
    }

    void displayDetails()
	{
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }

 
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
        StudentProcess s = new StudentProcess();

        int choice;

        do 
		{
            System.out.println("1. Enter Student Details");
            System.out.println("2. Display Student Details");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            switch (choice) 
			{
                case 1:
                    s.getDetails();
                    break;

                case 2:
                    s.displayDetails();
                    break;

                case 3:
                    System.out.println("Exit");
                    break;
            }
        } while (choice != 3);

	}
   }
