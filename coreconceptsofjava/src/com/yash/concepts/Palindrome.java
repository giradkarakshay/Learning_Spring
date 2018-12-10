/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class Palindrome {

	public static void main(String[] args) {
		Palindrome pm = new Palindrome();
		pm.checkPalindrome1("DogeeseseeGod");
		pm.checkPalindrome2("malayalam");
		pm.checkPalindrome3("1234442");
	}

	private void checkPalindrome1(String str) {
		StringBuilder sb = new StringBuilder(str);
		// reverse the string and check if it is equal to original
		// string
		if (str.equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

	/**
	 * In a palindrome one half of the string is the mirror image of the other this
	 * logic is based on that
	 * 
	 * @param str
	 */
	private void checkPalindrome2(String str) {
		int index = str.length() / 2;
		StringBuilder sb = new StringBuilder(
				index + index == str.length() ? str.substring(index) : str.substring(index + 1));
		if (str.substring(0, index).equalsIgnoreCase(sb.reverse().toString())) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

	/**
	 * If no inbuilt function has to be used.
	 * 
	 * @param str
	 */
	private void checkPalindrome3(String str) {
		StringBuilder sb = new StringBuilder();
		// start reading the string backward
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println("string 3 " + sb.toString());
		if (str.equalsIgnoreCase(sb.toString())) {
			System.out.println(str + " is a Palindrome");
		} else {
			System.out.println(str + " is not a Palindrome");
		}
	}

}
