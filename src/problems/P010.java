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
		int n = 2000000;
		printAnswer(n);
	}
	
	public static void printAnswer(int n) {
		System.out.println(getSumOfAllPrimesTo(n));
	}
	
	public static long getSumOfAllPrimesTo(int n) {
		long sum = 0;

		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				sum += i;
			}
		}

		return sum;
	}
	
	private static boolean isPrime(int n) {
		if (n == 2) {
			return true;
		} else if (n < 2 || n % 2 == 0) {
			return false;
		} 
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
