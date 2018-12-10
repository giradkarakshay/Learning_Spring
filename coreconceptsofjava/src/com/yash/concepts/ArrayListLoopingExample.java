/**
 * 
 */
package com.yash.concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author akshay.giradkar
 *
 */
public class ArrayListLoopingExample {

	public static void main(String[] args) {
		// Using Diamond operator, so with ArrayList
		// don't need to provide String, this option is available from
		// Java 7 onwards
		List<String> cityList = new ArrayList<>();
		cityList.add("Delhi");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		cityList.add("Chennai");
		cityList.add("Kolkata");

		// Using for loop with size
		System.out.println("With simple for loop");
		for (int i = 0; i < cityList.size(); i++) {
			System.out.println("City Name - " + cityList.get(i));
		}

		// Using for-each loop
		System.out.println("With for-each loop - Java 5");
		for (String name : cityList) {
			System.out.println("City Name - " + name);
		}

		// Using Iterator
		System.out.println("With iterator - Java 5");
		Iterator<String> itr = cityList.iterator();
		while (itr.hasNext()) {
			System.out.println("City Name - " + itr.next());
		}

		// Using List Iterator - though not needed if doing sequential looping
		System.out.println("With List iterator - Java 5");
		ListIterator<String> ltr = cityList.listIterator();
		while (ltr.hasNext()) {
			System.out.println("City Name - " + ltr.next());
		}

		// Using Java 8 iterable.forEach loop
		System.out.println("With for-each loop - Java 8");

		cityList.forEach((a) -> System.out.println("City Name - " + a));

		// Using Java 8 iterable.forEach loop with method reference
		cityList.forEach(System.out::println);

	}
}
