/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {

		String reverseItr = reverseItr("India is my country");
		System.out.println("reverse (non recursive) - " + reverseItr);
	}

	  //Using iteration - Non Recursive
	private static String reverseItr(String str) {
		// validation
		if ((str == null) || (str.length() <= 1)) {
			return str;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
