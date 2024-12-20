package com.rays.basic;

public class Same_Place_Reverce {
	public static void main(String[] args) {
		
		String s = "akshat saxena";
		
		String [] s1 = s.split(" ");
		
		
		for (int i = 0; i < s1.length; i++) {
		for (int j = s1[i].length() - 1 ; j >= 0 ; j--) {
			System.out.print(s1[i].charAt(j));
			
		}
		System.out.print(" ");
			
		}
		
		
	}

}
