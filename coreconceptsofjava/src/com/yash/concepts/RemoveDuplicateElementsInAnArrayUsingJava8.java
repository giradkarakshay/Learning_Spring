/**
 * 
 */
package com.yash.concepts;

import java.util.Arrays;

/**
 * @author akshay.giradkar
 *
 */
public class RemoveDuplicateElementsInAnArrayUsingJava8 {

	public static void main(String[] args) {

		int[] intArr = { 1, 2, 2, 5, 1, 6, 12, 7, 12, 12, 3, 8 };
		int tempArr[] = Arrays.stream(intArr).distinct().toArray();

		System.out.println("");
		System.out.println("after removal");
		for (int i : tempArr) {
			System.out.print(i + " ");
		}

	}

}
