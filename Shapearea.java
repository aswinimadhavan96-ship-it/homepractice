import java.util.Scanner;
class Shapearea
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		{
			System.out.println("Choose the shape to calculate the area:");
			System.out.println("1.Circle");
			System.out.println("2.Square");
			System.out.println("3.Rectangle");
			System.out.println("4.Triangle");
			System.out.print("Enter the num: ");
			int num=in.nextInt();
			switch(num)
			{
			case 1:
			
				System.out.print("Enter radius of circle: ");
				double r=in.nextDouble();
				double ca=(22/7.0)*r*r;
				System.out.println("Area of circle = "+ ca);
				break;
			
			case 2:
			
				System.out.print("Enter side of square: ");
				double side=in.nextDouble();
				double sa=side*side;
				System.out.println("Area of Square = "+ sa);
				break;
			
			case 3:
			
				System.out.print("Enter legnth of Rectangle: ");
				double l=in.nextDouble();
				System.out.print("Enter breadth of Rectangle: ");
				double b=in.nextDouble();
				double ra=l*b;
				System.out.println("Area of Rectangle = "+ ra);
				break;
			case 4:
			
				System.out.print("Enter base of triangle: ");
				double base=in.nextDouble();
				System.out.print("Enter height of triangle: ");
				double h=in.nextDouble();
				double at=(base*h)/2;
				System.out.println("Area of Triangle= "+ at);
				break;
			
			default:
				System.out.println("Wrong number");			
			}
		}
			
	}
}