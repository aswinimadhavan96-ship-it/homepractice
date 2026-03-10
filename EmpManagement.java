package empmanagement;
import java.util.Scanner;

class Employee{
    int id;
    String name;
    String department;
    Employee(int id,String name,String department){
        this.id=id;
        this.name=name;
        this.department=department;
    }
           void display(){
               System.out.println("ID: "+id);
               System.out.println("Name: "+name );
               System.out.println("Department: "+department);
           }
           
}
        
public class EmpManagement {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Employee[] employees=new Employee[100];
    int count=0;
    int choice;
    do{
        System.out.println("\n    EMPLOYEE MANAGEMENT    ");
        System.out.println("1.Add Emloyee");
        System.out.println("2.View Empployee");
        System.out.println("3.Search Emloyee by ID");
        System.out.println("4.EXIT");
        System.out.println("Enter your choice");
        choice =sc.nextInt();
        switch(choice)
        {
            case 1:
                if(count<100){
                    System.out.println("    Enter EMployee ID");
                    int id=sc.nextInt();
                    sc.nextLine();
                    
                    System.out.println("Enter NAME:");
                    String name=sc.nextLine();
                    
                    System.out.println("Enter the department");
                    String department=sc.nextLine();
                    
                    employees[count]=new Employee(id,name,department);
                    count++;
                    
                    System.out.println("Employee added successfully");
                }else {
                    System.out.println("Employee list is full");
                }break;
            case 2:
                    if(count==0){
                        System.out.println("No Employee found");
                }else{
                        System.out.println("\n Emloyee list");
                        for (int i = 0; i < count; i++) {
                        employees[i].display();
                        }
                        }break;
            
                        case 3:             
                            System.out.println("Enter Employee ID");
                            int searchId=sc.nextInt();
                            boolean found=false;
                            for (int i = 0; i < count; i++) {
                            if(employees[i].id==searchId){
                            System.out.println("Employee found ");
                            found=true;
                            break;
         
                            }
                       }if(!found){
                       System.out.println("Employee not found");
                       
                        }
                        break;
                        
                       case 4:
                              System.out.println("EXISTING program");
                              default:
                              System.out.println("Invalid ");
}   
                        
    }while(choice!=4);
    sc.close();
        
    }
}
