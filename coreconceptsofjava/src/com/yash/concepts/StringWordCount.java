/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class StringWordCount {

	public static void main(String[] args) {
		
		System.out.println("Count using forward logic " + countWordsForwardLogic(" Life     is       beautiful"));

		System.out.println("Count using split logic " + countWordsUsingSplit(" Life     is       beautiful  "));
	}

	/**
	 * This method counts using forward logic
	 * 
	 * @param str
	 * @return
	 */
	private static int countWordsForwardLogic(String str) {
		int c = 0;
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			// this check is required so that
			// we don't try to read beyond the String length
			if (i + 1 < str.length()) {
				ch[i + 1] = str.charAt(i + 1);
			}
			/**
			 * logic here is after reading the last character in a word it should be
			 * followed by either space or tab, in that case increment the count
			 */
			if ((i + 1 < str.length() && (ch[i] != ' ' && ch[i] != '\t') && (ch[i + 1] == ' ' || ch[i + 1] == '\t'))
					|| (i + 1 == str.length() && ch[i] != ' ')) {
				c++;
			}
		}
		return c;

	}

	/**
	 * This method counts using String split method
	 * 
	 * @param str
	 * @return
	 */
	private static int countWordsUsingSplit(String str) {
		// here split method is used with regex pattern of any number of spaces
		// so it will retrun a string array with the words
		String[] test = str.trim().split("\\s+");
		return test.length;

	}

}
