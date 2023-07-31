package practice;

public class PracticeIf {
	public static void displayString() {
		
		for(int number = 1; number <= 100; number++) {
			System.out.print(number);
			
			if(number % 3 == 0) {
				System.out.print("Fizz");
			}

			if(number % 5 == 0) {
				System.out.print("Buzz");
			}
			
			System.out.print("\n");
		}
	}
}
