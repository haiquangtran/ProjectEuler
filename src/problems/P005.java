package problems;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * @author Hai
 *
 */
public class P005 {

	public static void main(String[] args) {
		int n = 20;
		printAnswer(n);
	}
	
	public static void printAnswer(int n) {
		System.out.println(getSmallestNumberDivisibleByNumbersFrom1To(n));
	}
	
	public static int getSmallestNumberDivisibleByNumbersFrom1To(int n) {
		int max = Integer.MAX_VALUE;
		int smallestNumber = 0;
		
		for (int i = n; i <= max; i += n) {
			for (int j = n; j > 0; j--) {
				if (i % j != 0) {
					break;
				} else if (j == 1) {
					smallestNumber = i;
					return smallestNumber;
				}
			}
		}
		
		return smallestNumber;
	}

}
