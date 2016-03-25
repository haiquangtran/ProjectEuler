package problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * 
 * Find the product abc.
 * 
 * @author Hai
 *
 */
public class P009 {

	public static void main(String[] args) {
		printAnswer();
	}

	public static void printAnswer() {
		System.out.println(isPythTriplet(3, 4, 5));
	}
	
	public static boolean isPythTriplet(int a, int b, int c) {
		if (a < b && a < c && b < c) {
			if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
				return true;
			}
		}
		return false;
	}
	
}
