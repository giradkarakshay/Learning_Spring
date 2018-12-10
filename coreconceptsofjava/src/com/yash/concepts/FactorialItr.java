package com.yash.concepts;

import java.util.Scanner;

public class FactorialItr {

	public static void main(String[] args) {
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = input.nextInt();
		int fact = calculateFactorial(num);
		System.out.println("Factorial of " + num + " is " + fact);

	}

	private static int calculateFactorial(int num) {
		int fact = 1;
		for (int i = num; i >= 1; i--) {
			fact = fact * i;
		}
		return fact;

	}
}