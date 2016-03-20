package problems;

/**
 * Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, 
 * we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @author Hai
 */
public class Q1 {

	public static void main(String[] args) {
		printAnswer(1000);
	}
	
	public static void printAnswer(int limit) {
		int total = 0; 
		
		for (int i = 0; i < limit; i++) {
			if (isMultipleOfThreeOrFive(i)) {
				total += i;
			}
		}
		
		System.out.println(total);
	}
	
	public static boolean isMultipleOfThreeOrFive(int number) {
		return isMultipleOf(3, number) || isMultipleOf(5, number);
	}
	
	public static boolean isMultipleOf(int multiple, int number) {
		return (number % multiple == 0);
	}

}
