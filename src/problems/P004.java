package problems;

import java.util.ArrayList;
import java.util.Collections;


/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author Hai
 *
 */
public class P004 {

	public static void main(String[] args) {
		printAnswer();
	}

	public static void printAnswer() {
		System.out.println(getLargestPalindromeFromProductOfDigits(3));
	}

	/**
	 * Finds the largest palindrome made from the product of two numbers specifying the number of digits in both numbers.
	 * e.g. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
	 * 
	 * @param numOfDigits number of digits in each number
	 */
	public static int getLargestPalindromeFromProductOfDigits(int numOfDigits) {
		ArrayList<Integer> palindromes = getAllPalindromes(numOfDigits);

		// Find the largest
		Collections.sort(palindromes, Collections.reverseOrder());

		return palindromes.get(0);
	}

	public static ArrayList<Integer> getAllPalindromes(int numOfDigits) {
		ArrayList<Integer> palindromes = new ArrayList<>();
		int maxNumber = getMaxNumber(numOfDigits);
		for (int i = maxNumber; i >= 0; i--) {
			for (int j = maxNumber; j >= 0; j--) {
				int product = i * j;
				if (isPalindrome(product)) {
					palindromes.add(product);
				}
			}
		}
		return palindromes;
	}

	/**
	 * Returns the highest number given the number of digits in the number.
	 * 
	 * @param numOfDigits
	 * @return
	 */
	public static int getMaxNumber(int numOfDigits) {
		int maxValue = 0;
		for (int i = 0; i < numOfDigits; i++) {
			maxValue = maxValue * 10 + 9;
		}
		return maxValue;
	}

	public static boolean isPalindrome(int n) {
		String nValue = String.valueOf(n);
		for (int i = 0; i < nValue.length()/2; i++) {
			if (nValue.charAt(i) != nValue.charAt(nValue.length()-1-i)) {
				return false;
			}
		}
		return true;
	}

}
