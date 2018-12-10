/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class PrintingNumberInFibonnacciOrder {

	public static void main(String[] args) {

		int sum = 0;

		int num = 10, t1 = 0, t2 = 1;
		
		System.out.print(t2);

		for (int i = 1; i <= num; ++i) {

			sum = t1 + t2;
			t1 = t2;
			t2 = sum;

			System.out.print(sum);
		}

		
	}

}
