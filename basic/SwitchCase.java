package com.rays.basic;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("enter first no...");

		int a = s.nextInt();

		System.out.println("enter second no...");

		int b = s.nextInt();

		System.out.println("enter you opr...");

		char opr = s.next().charAt(0);

		switch (opr) {
		case '+':
			System.out.println("sum = " + (a + b));
			break;
		case '-':
			System.out.println("substraction = " + (a - b));
			break;
		default:
			System.out.println("this is default");
			break;
		}

	}

}
