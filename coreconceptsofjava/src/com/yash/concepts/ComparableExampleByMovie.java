/**
 * 
 */
package com.yash.concepts;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author akshay.giradkar
 *
 */
public class ComparableExampleByMovie implements Comparable<ComparableExampleByMovie> {

	private double rating;
	private String name;
	private int year;

	@Override
	public int compareTo(ComparableExampleByMovie o) {

		return this.year - o.year;
	}

	/**
	 * @param rating
	 * @param name
	 * @param year
	 */
	public ComparableExampleByMovie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	/**
	 * @return the rating
	 */
	public double getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(double rating) {
		this.rating = rating;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

}

class TestDemo 
{ 
    public static void main(String[] args) 
    { 
        ArrayList<ComparableExampleByMovie> list = new ArrayList<ComparableExampleByMovie>(); 
        list.add(new ComparableExampleByMovie(8.3,"Force Awakens", 2015)); 
        list.add(new ComparableExampleByMovie( 8.7,"Star Wars", 1977)); 
        list.add(new ComparableExampleByMovie( 8.8,"Empire Strikes Back", 1980)); 
        list.add(new ComparableExampleByMovie( 8.4,"Return of the Jedi", 1983)); 
  
        Collections.sort(list); 
  
        System.out.println("Movies after sorting : "); 
        for (ComparableExampleByMovie movie: list) 
        { 
            System.out.println(movie.getName() + " " + 
                               movie.getRating() + " " + 
                               movie.getYear()); 
        } 
    } 
}
