
public class Survey {
	public static int[] questions() 
	{
		System.out.println("What is the name of your youngest pet?");
		String petName = LottoGame.input.next();
		int petValue = petName.charAt(2);
		
		System.out.println("What is the age of that pet in years?");
		int petAge = LottoGame.input.nextInt();
		
		System.out.println("What is your lucky number?");
		int lucky = LottoGame.input.nextInt();
		
		boolean qb = Quarterback.qbYesNo();
		
		int qbNum = 0;
		if (qb == true) qbNum = Quarterback.qbJersey();
		
		System.out.println("What is two-digit model year of your car?");
		int carYear = LottoGame.input.nextInt();
		
		System.out.println("What is the first name of the your favorite actor/actress?");
		String actor = LottoGame.input.next();
		int actorValue = actor.charAt(0);
		
		int random = RandomNumber.getNumber();
		
		int[] surveyValues = {petValue, petAge, lucky, qbNum, carYear, actorValue, random};
		return surveyValues;
	}
}
