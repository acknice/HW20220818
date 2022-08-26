import java.util.Arrays;

public class ControlFlow {

	public static void main(String[] args) {

		AsciiChars.printNumbers();
		AsciiChars.printUpperCase();
		AsciiChars.printLowerCase();
		
		boolean playing = LottoGame.begin();
		
		while (playing == true) 
		{
			int[] surveyResults = Survey.questions();
			int[] regBalls = LottoNumbers.firstFive(surveyResults);
			int magicBall = LottoNumbers.magic(surveyResults);
			System.out.println("Lottery Numbers: " + Arrays.toString(regBalls) + " Magic Ball: " + magicBall);
			playing = LottoGame.end();
		}
	
		
		

		

	}	
}
