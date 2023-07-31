package practice;

public class PracticeDoWhile {
	public static void displayNumber() {
		int number = 100;
		do {
			System.out.println(number--);
		} while (number >= 0);
	}
}