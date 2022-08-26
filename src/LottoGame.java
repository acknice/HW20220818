import java.util.Scanner;

public class LottoGame 
{
	public static Scanner input = new Scanner(System.in);

	public static boolean begin() 
	{
		System.out.println("Please enter your name: ");
		String userName = input.nextLine();
		System.out.println("Hello " + userName + "!");
	
		System.out.println("Would you like to proceed with the interactive survey?");
		String consent = input.next();
		switch (consent) 
		{	
			case "Yes":
			case "yes":
			case "Y":
			case "y":
				System.out.println("Excellent! Please answer the following questions:");
				return true;
			default:
				System.out.println("Very well. Please return later to complete the survey. Goodbye");
				return false;
		}
	}
	
	public static boolean end()
	{
		System.out.println("Are you happy with your numbers?");
		String consent = input.next();
		switch (consent) 
		{	
			case "Yes":
			case "yes":
			case "Y":
			case "y":
				System.out.println("Excellent! Good luck!");
				return false;
			case "No":
			case "no":
			case "N":
			case "n":
				System.out.println("Alright then, let's play again");
				return true;
			default:
				System.out.println("I'm not sure how to take that. Bye for now.");
				return false;
		}
	}
		
}
