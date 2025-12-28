import java.util.Scanner;
class Spotify
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1.A.R.RAHUMAN");
	System.out.println("2.ANIRUDH");
	System.out.println("3.HARISH JEYARAJ");
	System.out.println("4.ILAYARAJA");
	System.out.println("5.UI");
	
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.print("Playlists of A.R.Rahuman");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational song");
			System.out.println("4.Sad");
			System.out.print("Select your option:");
			int option=sc.nextInt();
			if(option==1)
			{
				System.out.println("1.Melody");
				System.out.println("*Netru illadha matram");
				System.out.println("*Enna solla pogirai");
				System.out.println("*Ennavale adi ennavale");
				System.out.println("*Malargale malargale");
		
			}
			else if(option==2)
			{
				System.out.println("2.Kuthu");
				System.out.println("*Thaiya thaiya");
				System.out.println("*Mukkala mukkabala");
				System.out.println("*Urvasi urvasi");
				System.out.println("*Arthichudi");
			}
			else if(option==3)
			{
				System.out.println("3.Motivational song");
				System.out.println("*Vandhe matharam");
				System.out.println("*Oruvan oruvan muthalali");
				System.out.println("*Shakthi kodu");
				System.out.println("*Kappal yeari poyatchi");
				
			}	
			else if(option==4)
			{	
				System.out.println("4.Sad");
				System.out.println("*Poongatrile");
				System.out.println("*Marudaani");
				System.out.println("*Minnale en vazhvin");
				System.out.println("*Rasathi");
				System.out.println("*Oru poiyavadhu sol");
				
			}
			else 
			{
				System.out.println("Sorry this song is not available");
				
			}	
			}
			
			else if(choice==2)
			{
			System.out.print("Playlists of ANIRUDH");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Motivational song");
			System.out.println("4.Sad");
			System.out.print("Select your option:");
			int option=sc.nextInt();
			
			if(option==1)
			{
				System.out.println("1.Melody");
				System.out.println("*Neum naanum anbe");
				System.out.println("*Velicha poove");
				System.out.println("*Po indru neyaga");
				System.out.println("*Nee partha vizhigal");
		
			}
			else if(option==2)
			{
				System.out.println("2.Kuthu");
				System.out.println("*Vaathi raid");
				System.out.println("*Naa ready");
				System.out.println("*Badass");
				System.out.println("*Vandha edam");
			}
			else if(option==3)
			{
				System.out.println("3.Motivational song");
				System.out.println("*Velai illa pattathari");
				System.out.println("*Boomi enna suthudhe");
				System.out.println("*Ethir neechal");
				System.out.println("*Surviva");
				
			}	
			else if(option==4)
			{	
				System.out.println("4.Sad");
				System.out.println("*Porkanda singam");
				System.out.println("*Marudaani");
				System.out.println("*Minnalea en vazhvin");
				System.out.println("*Rasathi");
				System.out.println("*Oru poiyavadhu sol");
				
			}
			else 
			{
				System.out.println("Sorry this song is not available");
			
			}
			}
			else if(choice==3)
			{
			System.out.print("Playlists of HARISH JEYARAJ");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			System.out.print("Select your option:");
			int option=sc.nextInt();
			
			if(option==1)
			{
				System.out.println("1.Melody");
				System.out.println("*Unnalea");
				System.out.println("*Annul maele");
				System.out.println("*Yedho ondru");
				System.out.println("*Vaseegara");
				System.out.println("*Paartha mudhal");
		
			}
			else if(option==2)
			{
				System.out.println("2.Kuthu");
				System.out.println("*Tirunelveli halwa da");
				System.out.println("*Aaradi karte");
				System.out.println("*Soda bottle");
				System.out.println("*Aruva meesai");
			
				
			}	
			else if(option==3)
			{	
				System.out.println("3.Sad");
				System.out.println("*Venmathiye");
				System.out.println("*Oh manamey");
				System.out.println("*Yamma yamma");
				System.out.println("*Othayile");
			
				
			}
			else 
			{
				System.out.println("Sorry this song is not available");
			}
			}
			else if(choice==4)
			{
			System.out.print("Playlists of ILLAYARAJA");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			System.out.print("Select your option:");
			int option=sc.nextInt();
			
			if(option==1)
			{
				System.out.println("1.Melody");
				System.out.println("*Oru kili urugudhu");
				System.out.println("*Kuzhaloodhum kannanukku");
				System.out.println("*Ennai thottu");
				System.out.println("*Raja raja cholan");
			
			}
			else if(option==2)
			{
				System.out.println("2.Kuthu");
				System.out.println("*Ooruvittu ooruvandhu");
				System.out.println("*Nooru varusham");
				System.out.println("*Aasai nooruvagai");
				System.out.println("*Aasai athigam vachu");
			
				
			}	
			else if(option==3)
			{	
				System.out.println("3.Sad");
				System.out.println("*Kanne kalaimane");
				System.out.println("*Thene thenpandi neeye");
				System.out.println("*Paadi parandha kili");
				System.out.println("Nilavey vaa");
			
			}
			else 
			{
				System.out.println("Sorry this song is not available");
			
			}
			}
			else if(choice==5)
			{
			System.out.print("Playlists of UI");
			System.out.println("1.Melody");
			System.out.println("2.Kuthu");
			System.out.println("3.Sad");
			System.out.print("Select your option:");
			int option=sc.nextInt();
		
			if(option==1)
			{
				System.out.println("1.Melody");
				System.out.println("*Aathadii manasudhan");
				System.out.println("*Chinna sirisu");
				System.out.println("*Venmegamey");
				System.out.println("*Iyayyayoo");
			
			}
			else if(option==2)
			{
				System.out.println("2.Kuthu");
				System.out.println("*Machi open the bottle");
				System.out.println("*No money no honey");
				System.out.println("*Soroja saman nikalo");
				System.out.println("*Villaiyadu mangatha");
			}
			
			else if(option==3)
			{	
				System.out.println("3.Motivational song");
				System.out.println("*Edhirthu nill");
				System.out.println("*Oru naalil");
				System.out.println("*Nimirthu nill");
				System.out.println("*Ungakkule mirugam");
			}
			else if(option==4)
			{	
				System.out.println("3.Sad");
				System.out.println("Kadhal valrthen");
				System.out.println("*Yedho ondru ennai");
				System.out.println("*Pogadhe");
				System.out.println("Ninaithu ninaithu");
			}
			else 
			{
				System.out.println("Sorry this song is not available");
			}
			}
			else
			{
				System.out.println("THANK YOU FOR USING ME!");
			}
		
		
		}	
		
	

}



		
	
	
