package problems;

import java.math.BigInteger;

/**
 * n! means n x ( n - 1 ) x ... x 3 x 2 x 1
 *  
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * @author Hai
 *
 */
public class P020 {

	public static void main(String[] args) {
		int n = 100;
		printAnswer(n);
	}
	
	public static void printAnswer(int n) {
		System.out.println(getSumOfFactorial(n));
	}
	
	public static int getSumOfFactorial(int n) {
		int sum = 0;
		String number = String.valueOf(getFactorial(n));
		
		for (int i = 0; i < number.length(); i++) {
			sum += Character.getNumericValue(number.charAt(i));
		}
		return sum;
	}
	
	public static BigInteger getFactorial(int n) {
		BigInteger sum = BigInteger.ONE;
		for (long i = n; i > 0; i--) {
			sum = sum.multiply(BigInteger.valueOf(i));
		}
		return sum;
	}

}
