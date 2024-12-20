package com.rays.basic;

public class Swapping_String {
	
	public static void main(String[] args) {
		
	 String name = "akasht saxena";
	 
	 String [] s1 = name.split(" ");
	 
	 for (int i = 0; i < s1.length; i++) {
		 for (int j = (s1.length) - 1; j < 0; j--) {
			 System.out.println(s1[i].charAt(j));
			
		}
		 System.out.println("");
		
	}
		
	}

}
