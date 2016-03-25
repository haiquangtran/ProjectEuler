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
		int n = 1000;
		printAnswer(n);
	}

	public static void printAnswer(int n) {
		System.out.println(getProductOfPythTripletSummingTo(n));
	}

	public static int getProductOfPythTripletSummingTo(int n) {
		int productOfPythTriplet = 0;
		for (int c = n; c > 0; c--) {
			for (int b = c; b > 0; b--) {
				for (int a = b; a > 0; a--) {
					if (a + b + c == n && isPythTriplet(a, b, c)) {
						productOfPythTriplet = a * b * c;
						return productOfPythTriplet;
					}
				}
			}
		}
		return productOfPythTriplet;
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
