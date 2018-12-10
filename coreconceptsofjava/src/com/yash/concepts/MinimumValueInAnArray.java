/**
 * 
 */
package com.yash.concepts;

import java.util.Arrays;

/**
 * @author akshay.giradkar
 *
 */
public class MinimumValueInAnArray {

	public static void main(String[] args) {

		int[] array = { 67, 98, 454, 34, 23 };
		
		Arrays.sort(array);
		System.out.println("Minimum = " + array[0]);
		System.out.println("Maximum = " + array[array.length-1]);

		//System.out.println(getMinValue(array));
	}

	public static int getMinValue(int[] numbers) {
		int minValue = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				minValue = numbers[i];
			}
		}
		return minValue;
	}
}
