/**
 * 
 */
package com.yash.concepts;

/**
 * @author akshay.giradkar
 *
 */
public class CountCharacters {

	public static void main(String[] args) {
		CountCharacters cc = new CountCharacters();
		cc.countChars("I am an Indian");
	}

	public void countChars(String str) {
		char[] strArr;
		do {
			strArr = str.toCharArray();
			char ch = strArr[0];
			int count = 1;
			for (int i = 1; i < strArr.length; i++) {
				if (ch == strArr[i]) {
					count++;
				}
			}
			// We don't need to count spaces
			if (((ch != ' ') && (ch != '\t'))) {
				System.out.println(ch + " - " + count);
			}
			// replace all occurrence of the character
			// which is already iterated and counted
			str = str.replace("" + ch, "");
		} while (strArr.length > 1);
	}

}
