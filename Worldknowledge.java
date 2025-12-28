import java.util.Scanner;
class Worldknowledge
{
	public static void main(String[] args)
	{
		System.out.println("WE WELCOME YOU");
		System.out.println("1. FICTION ");
		System.out.println("2. FANTASY ");
		System.out.println("3. BUSINESS ");
		System.out.println("4. PSYCHOLOGY ");
		System.out.println("SELECT YOUR OPTIONS :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("The options are: ");
			System.out.println("1. RISE OF THE FALLEN: The Manwaan Series Book 1");
			System.out.println("2. Shadows Rising ");
			System.out.println("3. Kunex,It Ends with Us ");
			System.out.print("Enter your option ");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("		RISE OF THE FALLEN: The Manwaan Series Book");
				String Description="Description:A cultural fusion. A modern twist. An ancient battle of good and evil. Amidst an eternal \n family feud, a purposeless and hyper-anxious Rinad discovers that he is part human and part celestian \n Manwaan! As he navigates through his strange new reality, he encounters magnificent Angels, along with"  ;
				System.out.println(Description);
				System.out.print("Author: Abhishek Krishnan");
				System.out.print("		Language: English ");
				System.out.print("		Rate: Rs.300.");
			}
			else if(option==2)
			{
				System.out.println("		2.Shadows Rising ");
				String Description="Description:Banished from the celestial court for an unspeakable crime, Akran, once a powerful yaksha,\n spends his days in the city of Mumbai, drinking cheap rum and pretending to be human. \n When a young girl is abducted, Akran finds himself reluctantly dragged into the investigation. But, as\n soon discovers, this is not a simple case of kidnapping—villainous thugs, gods and demons are all \n involved. And an ancient evil is returning to the world. ";
				System.out.println(Description);
				System.out.print("Author: Rohan Monteiro");
				System.out.print("		Language: English");
				System.out.print("		Rate: Rs.250");
			}
			else if(option==3)
			{
				System.out.println("		3.Kunex, It Ends with Us ");
				String Description="Description:The newest, highly anticipated novel from beloved #1 New York Times bestselling author, \n Colleen Hoover. Sometimes it is the one who loves you who hurts you the most. Lily hasn?t always had it \n easy, but that's never stopped her from working hard for the life she wants. She?s come a long way from \n the small town in Maine where she grew up?she graduated from college, moved to Boston and started her \n own business. So when she feels a spark with a gorgeous neurosurgeon named Ryle Kincaid, everything \n in Lily?s life suddenly seems almost too good to be true.";
				System.out.println(Description);
				System.out.print("Author: Rohan Monteiro    ");
				System.out.print("		Language: English");
				System.out.print("		Rate: Rs.350.");
			}
			else
			{
				System.out.println("out of stock book");
			}
		}
		else if(choice==2)
		{
			System.out.println("  FANTASY ");
			System.out.println("The Options are: ");
			System.out.println("1.Compass and Blade  ");
			System.out.println("2.Blood metal Bone ");
			System.out.println("3.The shadows between us.   ");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("		1.Compass and Blade");
				String Description="Description: Mira is a wrecker, one of the seven chosen to swim out and plunder the wrecked ships \n beyond the Isle of Rosevear. The waves sing to her soul, the call of the sea beckoning her into deeper \n waters. But Rosevear needs her, and she could never abandon her home. Until one evening when \n lightning splits the sky and the Watch descend, taking Mira’s father away. "  ;
				System.out.println(Description);
				System.out.print("Author: Rachel Greenlaw  ");
				System.out.print("		Language: English   ");
				System.out.print("		Rate: Rs.370. ");
			}
			else if(option==2)
			{
				System.out.println("		2.Blood metal Bone");
				String Description=" Description :Wrongly accused of her brother’s murder, Sonara’s destiny was to die, sentenced to \n execution by her own mother. Punished and left for dead, the shadows have cursed her with a second life \n as a Shadow-blood, cast out and hunted by society for her demon-like powers. "  ;
				System.out.println(Description);
				System.out.print("Author: Lindsay Cummings  ");
				System.out.print("		Language: English ");
				System.out.print("		Rate: Rs.275 ");
			}
			else if(option==3)
			{
				System.out.println("		3.The Shadows between us. ");
				String Description=" Description:No one knows the extent of the freshly crowned Shadow King's power. Some say he can command  \n the shadows that swirl around him to do his bidding. Others say they speak to him, whispering the thoughts of his enemies.  \n Regardless, Alessandra, tired of being overlooked, has a plan to gain power: \nwoo the Shadow King, marry him, \n then kill him and take his kingdom for herself. "  ;
				System.out.println(Description);
				System.out.print("Author: Tricia Leven-seller ");
				System.out.print("		Language: English ");
				System.out.print("		Rate: Rs.304");
			}
			else
			{
				System.out.println("out of stock book");
			}
		}
		
		else if(choice ==3)
		{
			System.out.println("		BUSINESS");
			System.out.println("1.The Psychology of Money ");
			System.out.println("2.Do It Today");
			System.out.println("3.Atomic Habits");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("		1.The psycology of Money");
				String Description=" Description: Timeless lesson on wealth ,greed,and happiness doing well with  \n money isn't necessarily about what you know. It's how  about you behave. And behavior is hard to teah,even to really smart \n people. How to manage money,invest it, and make business decision are typically considered to involve \n a lot of mathematical calculations, where data and formulae tell us exactly what to do.";
				System.out.println(Description);
				System.out.print("Author: Morgan Housel  ");
				System.out.print("		Language: English   ");
				System.out.print("		Rate: Rs.300.");
			}
			else if(option==2)
			{
				System.out.println("		2.Do It Today");
				String Description=" Description: Are you also tried off your dreams until tomorrow \n , Guess what! Tomorrow never comes. \n Am i right? \n I've procrastinated and  \n putt off my desire to write a book for a decade. I always came up with excuses \n like,it's not the right time. Or, I need to do more research. \n But in 2025 I got tired of this endless procrastination, and  took action \n Six months later,my first book was published.\n Look we all have limited time on our hands. \n And we aer getting closer to death .That shouldn't scare. \n That's why we must do the thing we want: Today.";
				System.out.println(Description);
				System.out.print("Author:Darious Foroux ");
				System.out.print("		Language: English ");
				System.out.print("		Rate: Rs.100 ");
			}
			else if(option==3)
			{
				System.out.println("	3.Atomic Habits");
				String Description="Description: People think that when you want to change your life.you need to think big.\n But world remnowed habits expert james clear to has descovered another way. He knows that real change comes fromthe compound effect of hundreds of small decisions.doing well two push-ups a day,waking up five minutesearly,or holding a single short phone call.";
				System.out.println(Description);
				System.out.print("Author: James clear ");
				System.out.print("		Language: English  ");
				System.out.print("		Rate: Rs.350");
			}
			else
			{
				System.out.println("out of stock book");
			}
				
		}
		else if(choice ==4)
		{
			System.out.println("		Psychology ");
			System.out.println(" 1.Dark Psychology Secrets & Manipulation ");
			System.out.println("2.The Power of Your Subconscious Mind Do It Today ");
			System.out.println("3.The Courage to Be Disliked ");
			System.out.print("Enter your option");
			int option=sc.nextInt();
			if(option==1)
			{
				
				System.out.println("		1.Dark Psychology Secrets & Manipulation  ");
				String Description="Description: In relation to the psychological essence of the various kinds of people who prey on others, dark psychology can be seen as studying the human condition. The truth is that there is the potential for \nany single human being to victimize other people or other living creatures. Most people prefer to suppress  \n their dark impulses and prevent themselves from acting on any desire they have because of social norms, \n a human conscience, and other factors. ";
				System.out.println(Description);
				System.out.print("Author: Amy Brown");
				System.out.print("		Language: English");
				System.out.print("		Rate: Rs.300");
			}
			else if(option==2)
			{
				System.out.println("		2.The Power of Your Subconscious Mind Do It Today  ");
				String Description="Description: This remarkable book by Dr. Joseph Murphy, one of the pioneering voices of affirmative \n thinking, will unlock for you the truly staggering powers of your subconscious mind. Combining time\n honored spiritual wisdom with cutting edge scientific research, Dr. Murphy explains how the \nsubconscious mind influences every single thing that you do and how, by understanding it and learning to \n control its incredible force, you can improve the quality of your daily life.Everything, from the promotion  \n that you wanted and the raise you think you deserve, to overcoming phobias and bad habits and \n strengthening interpersonal relationships, the Power of Your Subconscious Mind will open a world of \n happiness, success, prosperity and peace for you. It will change your life and your world by changing  \n your beliefs. ";
				System.out.println(Description);
				System.out.print("Author: Joseph Murphy");
				System.out.print("		Language: English");
				System.out.print("		Rate: Rs.100 ");
			}
			else if(option==3)
			{
				System.out.println(" 		3.The Courage to Be Disliked ");
				String Description="Description: The Courage to be Disliked shows you how to unlock the power within yourself to become  \n your best and truest self, change your future and find lasting happiness. Using the theories of Alfred \n Adler, one of the three giants of 19th century psychology alongside Freud and Jung, the authors explain \n how we are all free to determine our own future free of the shackles of past experiences, doubts and the \n expectations of others. It's a philosophy that's profoundly liberating, allowing us to develop the courage to \n change, and to ignore the limitations that we and those around us can place on ourselves.  ";
				System.out.println(Description);
				System.out.print("Author: Ichiro Kishimi and Fumitake Koga ");
				System.out.print("		Language: English ");
				System.out.print("		Rate: Rs.350 ");
			}
			else
			{
				System.out.println("out of stock book");
			}
				
		}
		else
		{
			System.out.println("Sorry this is not available"); 
		}
		System.out.println("THANK YOU FOR USING ME");
	}
}	