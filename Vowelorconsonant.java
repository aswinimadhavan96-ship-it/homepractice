import java.util.Scanner;
class Vowelorconsonant
{
	public static void main(String[] args)
	{
	Scanner scanner=new Scanner(System.in);
	{
		System.out.print("Print the Alphabet:");
		char character=scanner.next().charAt(0);
		switch(character)
		{
		case'a'->
				System.out.println("Vowel");
		case'e'->
				System.out.println("Vowel");
		case'i'->
				System.out.println("Vowel");
		case'o'->
				System.out.println("Vowel");
		case'u'->
				System.out.println("Vowel");
		default->
				System.out.println("consonant");
				
		}
	}
	}
}