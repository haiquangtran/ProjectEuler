package problems;

import java.math.BigInteger;

/**
 * The Fibonacci sequence is defined by the recurrence relation:
 * Fn = Fn-1 + Fn-2, where F1 = 1 and F2 = 1.
 * Hence the first 12 terms will be:
 * F1 = 1
 * F2 = 1
 * F3 = 2
 * F4 = 3
 * F5 = 5
 * F6 = 8
 * F7 = 13
 * F8 = 21
 * F9 = 34
 * F10 = 55
 * F11 = 89
 * F12 = 144
 * 
 * The 12th term, F12, is the first term to contain three digits.
 * What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * @author Hai
 *
 */
public class P025 {

	public static void main(String[] args) {
		int digitLength = 1000;
		printAnswer(digitLength);
	}

	public static void printAnswer(int digitLength) {
		System.out.println(getFibonacciIndexOfDigitLength(digitLength));
	}

	public static int getFibonacciIndexOfDigitLength(int digitLength) {
		int index = 0;
		BigInteger current = new BigInteger("0"), next = new BigInteger("1"), result = new BigInteger("0");

		// Invalid
		if (digitLength <= 0) return -1;

		while((result.toString()).length() != digitLength) {
			result = next.add(current);
			current = next;
			next = result;
			index++;
		}

		// The result is the digit length
		index++;
		
		return index;
	}

}
