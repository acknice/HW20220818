
public class RandomNumber {
	public static int getNumber()
	{
		int answer = 0;
		while(answer == 0)
		{
			System.out.println("Enter a random number between 1 and 50.");
			answer = LottoGame.input.nextInt();
			if (answer > 50) 
			{
				System.out.println("Answer too high. Please try again.");
				answer = 0;
			}
			else if (answer < 0) 
			{
				System.out.println("Answer too low. Please try again.");
				answer = 0;
			}
			else return answer;
		}
		return answer;
	}
}
