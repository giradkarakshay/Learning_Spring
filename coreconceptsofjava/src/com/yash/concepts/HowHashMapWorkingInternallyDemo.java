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
public class HowHashMapWorkingInternallyDemo {
	
	public static void main(String[] args) {
		
	String s1="FB";//Both has a same hashcode
	String s2="Ea";//------------------0000
	
	  
	
	System.out.println(s1.hashCode()+"-----"+s2.hashCode());
		
		Map<String,Integer> map = new HashMap<>();
		
		/*map.put("aaa", 1);
		map.put("bbb", 2);
		map.put("ccc", 3);
		map.put("ddd", 4);*/
		
	 map.put(s1, 1);//Hash Collision
	 map.put(s2, 2);
	
	
	}

}
