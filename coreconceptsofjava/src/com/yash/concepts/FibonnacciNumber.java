/**
 * 
 */
package com.yash.concepts;

import java.util.Scanner;

/**
 * @author akshay.giradkar
 *
 */

public class FibonnacciNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// user input
		System.out.println("Enter how many numbers are needed in Fibonacci series: ");
		int num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(printFibonacci(i) + " ");
		}
		input.close();
	}

	private static int printFibonacci(int num) {
		// For first two numbers
		if (num == 0) {
			return 0;
		}
		if (num == 1) {
			return 1;
		}
		return printFibonacci(num - 1) + printFibonacci(num - 2);
	}

}
