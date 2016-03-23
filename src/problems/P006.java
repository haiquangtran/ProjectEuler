package problems;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 
 * 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * @author Hai
 *
 */
public class P006 {
	
	public static void main(String[] args) {
		int n = 100;
		printAnswer(n);
	}
	
	public static void printAnswer(int n) {
		// find difference
		int answer = Math.abs(getSumOfSquaresOfNumbersTo(n) - getSquareOfSumOfNumbersTo(n));
		
		System.out.println(answer);
	}
	
	/**
	 * Gets the square of the sum of the first n natural numbers starting from 1.
	 * e.g. if n = 10 then it will return * (1 + 2 + ... + 10)^2 = 552 = 3025
	 * 
	 * @param n inclusive
	 * @return
	 */
	public static int getSquareOfSumOfNumbersTo(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return (int) Math.pow(sum, 2);
	}
	
	/**
	 * Gets sum of the squares of the first n natural numbers starting from 1.
	 * e.g. if n= 10 then it will return 1^2 + 2^2 + ... + 10^2 = 385
	 * 
	 * @param n inclusive
	 * @return
	 */
	public static int getSumOfSquaresOfNumbersTo(int n) {
		int sumOfSquares = 0;
		
		for (int i = 1; i <= n; i++) {
			sumOfSquares += Math.pow(i, 2);
		}
		
		return sumOfSquares;
	}
	
}
