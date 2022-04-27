import java.util.Scanner;

public class PigLatinPrompt {

	public static String piggyPrompt() {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter a word or phrase for me to Pig Latinize:");
		String userInput = scnr.nextLine();
		
		scnr.close();
		return userInput;
	}
	
	

}
