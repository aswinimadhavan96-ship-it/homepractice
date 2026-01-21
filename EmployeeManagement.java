import java.util.Scanner;
class EmployeeManagement
{
	int employee_id[]=new int [3];
	int length=0;
	Scanner sc=new Scanner(System.in);
	void addEmployeeId()
	{
		System.out.print("Enter Employee ID:");
		employee_id[length] = sc.nextInt();
        length++;
 
		System.out.println("Employee ID added Successfully. ");
		
	}
	
	void removeEmployeeId()
	{
		if(length==0)
		{
			System.out.println("No employee id to remove");
			return;
		}	
		
			System.out.println("Enter employee ID to remove:");
			int id=sc.nextInt();
			boolean found=false;
			for(int i=0;i<length;i++)
			{
			if(id==employee_id[i])
				{
				for(int j=i;j<length-1;j++)
				{
					employee_id[j]=employee_id[j+1];
				}
				length--;
				found=true;
				System.out.println("Employee ID REMOVED successfully");
				break;
					}
				}
				if(!found)
				{
					System.out.println("Employee ID not found.");
				}
		
	
				}	
	
	void displayEmployeeIds()
	{
		System.out.println("Employee IDs: ");
		for(int i=0;i<length;i++)
		{
			System.out.print(employee_id[i]+" ");
		}
		System.out.println();
	}	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		EmployeeManagement obj=new EmployeeManagement();
		int choice;
		do
		{
			System.out.println("------- Menu -------");
            System.out.println("1. Add Employee ID");
            System.out.println("2. Remove Employee ID");
			System.out.println("3. Display Employee IDs");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice)
			{
                case 1:
                    obj.addEmployeeId();
                    break;
                case 2:
                    obj.removeEmployeeId();
                    break;
                case 3:
                    obj.displayEmployeeIds();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

       
			
			
			

		}
	
	}
	
	
	
	
	
	
	
