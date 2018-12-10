package com.yash.concepts;

public class ExceptionDemo {
	
	public void add() throws ArrayIndexOutOfBoundsException {
		System.out.println("add1");
	}
	
	
class A extends ExceptionDemo{
	public void add() {
		System.out.println("add2");
	}
}

public static void main(String[] args) {
	ExceptionDemo a = new ExceptionDemo();
	a.add();
}
}
