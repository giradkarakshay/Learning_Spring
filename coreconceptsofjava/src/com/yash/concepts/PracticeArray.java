package com.yash.concepts;

public class PracticeArray {

	public static void main(String[] args) {

		int[] array = { 67, 98, 454, 34, 23 };

		System.out.println(maxPairSum(array));
	}

	private static int maxPairSum(int[] arr) {

		int max = arr[0];

		int i, j = 0;
		int indexOfFirst = 0;
		int indexOfSecond = 0;

		for (i = 0; i < arr.length; i++) {

			for (j = i + 1; j < arr.length; j++) {

				int currentMax = arr[i] + arr[j];

				if (currentMax > max) {

					max = currentMax;
					indexOfFirst = i;
					indexOfSecond = j;

				}
			}

		}
		System.out.println(indexOfFirst + " " + indexOfSecond);
		return max;

	}

}
