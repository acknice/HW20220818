
public class LottoNumbers {
	private static int a = (int)((Math.random() * 5) + 1);
	private static int b = (int)(Math.random() * 7);
	private static int c = (int)(Math.random() * 10);
	
	public static int[] firstFive(int[] input)
	{
		int lottoOne = reduce((input[0]), 65);
		int lottoTwo = reduce((input[2] + input[4]), 65);
		int lottoThree = reduce((input[6] - b), 65);
		int lottoFour = reduce((input[5]), 65);
		int lottoFive = reduce((input[1] + input[3] + input[4] + c), 65);
		
		int[] regBalls = {lottoOne, lottoTwo, lottoThree, lottoFour, lottoFive};
		return regBalls;		
	}
	
	public static int magic(int[] input)
	{
		int magicBall;
		if (input[3] != 0) 
		{
			magicBall = reduce((input[3] * a),75);
		}
		else
		{
			magicBall = reduce((input[4] * a), 75);
		}
		return magicBall;
	}
	
	private static int reduce(int lotto, int maximum)
	{
		while (lotto > maximum) {
			lotto -= maximum;
		}
		return lotto;
	}
}
