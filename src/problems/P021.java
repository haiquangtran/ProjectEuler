package problems;

/**
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n which divide evenly into n).
 * If d(a) = b and d(b) = a, where a != b, then a and b are an amicable pair and each of a and b are called amicable numbers.
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; therefore d(220) = 284. 
 * The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * @author Hai
 *
 */
public class P021 {
	
	public static void main(String[] args) {
		int n = 10000;
		printAnswer(n);
	}
	
	public static void printAnswer(int n) {		
		System.out.println(getSumAmicableNumbersUnder(n));
	}
	
	public static int getSumAmicableNumbersUnder(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (isAmicableNumber(i)) {
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
	
	public static boolean isAmicableNumber(int i) {
		int a = i, sumA = getSumOfDivisors(a);
		int b = sumA, sumB = getSumOfDivisors(b);
		if (a != b && a == sumB && b == sumA) {
			return true;
		}
		return false;
	}
	
}
