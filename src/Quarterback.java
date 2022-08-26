
public class Quarterback {
	public static boolean qbYesNo()
	{
		System.out.println("Do you have a favorite quarterback?");
		String favQB = LottoGame.input.next();
		switch(favQB) 
		{
			case "Yes":
			case "yes":
			case "Y":
			case "y":
				return true;
			case "No":
			case "no":
			case "N":
			case "n":
				return false;
			default:
				System.out.println("I didn't get that. Let's move on.");
				return false;
		}

	}
	
	public static int qbJersey() 
	{
		System.out.println("What is their jersey number?");
		int jersey = LottoGame.input.nextInt();
		return jersey;	
	}
	
}
