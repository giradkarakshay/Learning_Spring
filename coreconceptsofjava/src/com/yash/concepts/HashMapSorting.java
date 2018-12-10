/**
 * 
 */
package com.yash.concepts;

import java.util.HashMap;
import java.util.Map;

/**
 * @author akshay.giradkar
 *
 */
public class HashMapSorting {

	public static void main(String[] args) {
		// creating HashMap
		Map<String, String> langMap = new HashMap<String, String>();
		// Storing (key, value) pair to HashMap
		langMap.put("ENG", "English");
		langMap.put("NLD", "Dutch");
		langMap.put("ZHO", "Chinese");
		langMap.put("BEN", "Bengali");
		langMap.put("ZUL", "Zulu");
		// retrieving value using key
		String language = langMap.get("BEN");
		System.out.println("Language- " + language);

		System.out.println("-- Map Elements --");
		for (Map.Entry<String, String> lang : langMap.entrySet()) {
			System.out.println("Key- " + lang.getKey() + "---------------- Value- " + lang.getValue());
		}
	}
}
