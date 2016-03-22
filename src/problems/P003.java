package problems;

import java.math.BigInteger;


/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 * 
 * @author Hai
 */
public class P003 {

	public static void main(String[] args) {
		BigInteger number = new BigInteger("600851475143");
		printAnswer(13195);
	}

	public static void printAnswer(int number) {
		System.out.println(getLargestPrime(number));
	}

	/**
	 * Helper method for Sieve of Eratosthenes.
	 * Initializes an array from 2 to n with true values.
	 * @param n
	 * @return boolean array
	 */
	public static boolean[] getBooleanArray(int n) {
		// where array index represents the number.
		boolean[] primeNumbers = new boolean[n + 1];

		for (int i = 2; i <= n; i++) {
			primeNumbers[i] = true;
		}

		return primeNumbers;
	}

	/**
	 * Get the largest prime number that is less than or equal to n > 2 by
	 * using Sieve of Eratosthenes.
	 */
	public static int getLargestPrime(int n) {
		boolean[] primeNumbers = getBooleanArray(n);
		int largestPrime = 2;

		for (int i = 2; i <= n; i++) {
			if (primeNumbers[i]) {
				// Find largest prime
				if (n % i == 0) {
					largestPrime = i;
				}
				// Mark multiples of i as non-primes
				for (int j = i; j * i <= n; j++) {
					primeNumbers[i * j] = false;
				}
			}
		}

		return largestPrime;
	}

}
