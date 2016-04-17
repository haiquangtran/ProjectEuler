package problems;

import java.util.HashSet;

/**
 * A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. 
 * For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.
 * A number n is called deficient if the sum of its proper divisors is less than n 
 * and it is called abundant if this sum exceeds n.
 * 
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, 
 * the smallest number that can be written as the sum of two abundant numbers is 24. 
 * 
 * By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * @author User
 *
 */
public class P023 {

	public static void main(String[] args) {
		int n = 28123;

		printAnswer(n);
	}

	public static void printAnswer(int n) {
		System.out.println(getSumOfNonAbundantNumbersTo(n));
	}

	public static int getSumOfNonAbundantNumbersTo(int n) {
		HashSet<Integer> sumOfAbundantNumbers = getAllSumOfTwoAbundantNumbers(n);
		int sum = 0;

		// find sum of all numbers that cannot be written as the sum of two abundant numbers
		for (int i = 0; i < n; i++) {
			if (!sumOfAbundantNumbers.contains(i)) {
				sum += i;
			}
		}

		return sum;
	}

	public static int getSumOfDivisors(int n) { 
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	public static boolean isDeficientNumber(int n) {
		if (getSumOfDivisors(n) < n) {
			return true;
		}
		return false;
	}

	public static boolean isAbundantNumber(int n) {
		return !isDeficientNumber(n) && !isPerfectNumber(n);
	}

	public static boolean isPerfectNumber(int n) {
		if (getSumOfDivisors(n) == n) {
			return true;
		}
		return false;
	}

	public static HashSet<Integer> getAllAbundantNumbers(int n) {
		HashSet<Integer> abundantNumbers = new HashSet<Integer>();
		
		// find all abundant numbers
		for (int i = 0; i <= n; i++) {
			if (isAbundantNumber(i)) {
				abundantNumbers.add(i);
			}
		}
		return abundantNumbers;		
	}
	
	public static HashSet<Integer> getAllSumOfTwoAbundantNumbers(int n) {
		HashSet<Integer> sumOfAbundantNumbers = new HashSet<Integer>();
		HashSet<Integer> abundantNumbers = getAllAbundantNumbers(n);
		
		// find all numbers that are written as the sum of two abundant numbers
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (abundantNumbers.contains(i) && abundantNumbers.contains(j)) {
					int result = i + j;
					sumOfAbundantNumbers.add(result);
				} 
			}
		}
		return sumOfAbundantNumbers;
	}
	
}
