package problems;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 * 
 * @author Hai
 *
 */
public class P007 {

	public static void main(String[] args) {
		printAnswer();
	}

	public static void printAnswer() {
		System.out.println(getTheNthPrime(10001));
	}

	public static int getTheNthPrime(int n) {
		int prime = 0;

		for (int i = 2, count = 0; count < n; i++) {
			if (isPrime(i)) {
				prime = i;
				count++;
			}
		}

		return prime;
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
