import java.util.Scanner;
class Studentlist
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the total no of student:");
		int num=sc.nextInt();
		
		String []student_name=new String[num];
		int choice;
		int index=0;
		do
		{
			System.out.println("Enter the choice");
			System.out.println("1.Add student name:");
			System.out.println("2.See the student:");
			System.out.println("EXIT");
			System.out.print("");
			
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
				if(index<student_name.length)
				{
					
					System.out.print("Enter name of student"+ (index+1));
					student_name[index]=sc1.nextLine();		
					index++;
					break;
					
				}
				else
				{
					System.out.println("Student Name List:");
					
				}
				case 2:
				
					for(int i=0;i<student_name.length;i++)
					{
						if(student_name[i]!=null)
						{
							System.out.println(student_name[i]+"");
						}
					}break;
				case 3:
						break;
				default:
						System.out.print("Enter the correct choice..");
		
				}	
		
				}while(choice!=3);
				
			
		
			
	}
}