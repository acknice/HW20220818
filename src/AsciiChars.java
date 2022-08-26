
public class AsciiChars {
	public static void printNumbers()
	  {
		System.out.println("Valid numeric input:");
		for (int i = 48; i < 58; i++) {
			char character = (char) i;
			System.out.print(character+ " ");
		}
		System.out.println("\n");
	  }

	  public static void printLowerCase()
	  {
		  System.out.println("Valid lowercase alphabet input:");
		  for (int i = 97; i < 123; i++) {
				char character = (char) i;
				System.out.print(character+ " ");
			}
		  System.out.println("\n");
	  }

	  public static void printUpperCase()
	  {
		  System.out.println("Valid uppercase alphabet input:");
		  for (int i = 65; i < 91; i++) {
				char character = (char) i;
				System.out.print(character+ " ");
			}
		  System.out.println("\n");
	  }
}
