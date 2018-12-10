/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class HighestPairSumInAnArray {

	public static void main(String[] args) {

		int[] arr = { 3409, 78, 5665 };
	
		System.out.println(maxPairSum(arr));

	}

	private static int maxPairSum(int[] array) {

		int max = array[0];
		int i, j = 0;
		int indexOfFirst = 0;
		int indexOfLast = 0;

		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {

				int currentMax = array[i] + array[j];

				if (currentMax > max) {
					max = currentMax;
					indexOfFirst = i;
					indexOfLast = j;
				}
			}

		}
		System.out.println(indexOfFirst + " " + indexOfLast);

		return max;

	}
}


