package com.rays.basic;

public class Swaping {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;

//		int c;
//
//		c = a;
//		a = b;
//		b = c;
//		

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

	}

}
