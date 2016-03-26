package problems;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * @author Hai
 *
 */
public class P010 {

	public static void main(String[] args) {
		int n = 17;
		printAnswer(n);
	}
	
	public static void printAnswer(int n) {
		
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
	 * Get the sum of all prime numbers that is less than n by
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
