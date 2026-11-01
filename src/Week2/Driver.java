package Week2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter some text: ");
			String userInput = scanner.nextLine();

			WordProcessor processor = new WordProcessor();
			processor.setText("Default text");

			// Test 1: User Input
			System.out.println("Word Count: " + processor.countWords(userInput));
			System.out.println("Length: " + processor.getLength(userInput));
			System.out.println("Letter Count: " + processor.countLetters(userInput));

			// Test 2: Null Input (Uses fallback text)
			System.out.println("Null Word Count: " + processor.countWords(null));
			System.out.println("Null Length: " + processor.getLength(null));
			System.out.println("Null Letter Count: " + processor.countLetters(null));
		}
	}
}