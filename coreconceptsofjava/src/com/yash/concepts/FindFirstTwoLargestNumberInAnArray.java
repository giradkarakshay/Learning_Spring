/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class FindFirstTwoLargestNumberInAnArray {

	public static void main(String[] args) {
		int numArr[] = { 2, 5, 14, 1, 26, 65, 123, 6 };
		int firstNum = 0;
		int secondNum = 0;

		for (int i = 0; i < numArr.length; i++) {
			if (firstNum < numArr[i]) {
				secondNum = firstNum;
				firstNum = numArr[i];
			} else if (secondNum < numArr[i]) {
				secondNum = numArr[i];
			}

		}
		System.out.println("Top two numbers : First -  " + firstNum + " Second " + secondNum);

	}

}
