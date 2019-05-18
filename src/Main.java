/*
 * Manny Peterson's Solution to Project Euler Problem #6
 * https://projecteuler.net/problem=6
 * 
 * Enjoy! :)
 * 
 */

public class Main {
	public static void main(String[] args) {
		long sumOfSquare = 0, squareOfSum = 0;
		for (long i = 1; i < 101; i++) {
			sumOfSquare += (i * i);
			squareOfSum += i;
		}
		squareOfSum = squareOfSum * squareOfSum;
		System.out.format("ANSWER = %d\n", squareOfSum - sumOfSquare);
	}
}
