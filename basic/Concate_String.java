package com.rays.basic;

public class Concate_String{
	
	public static void main(String[] args) {
	
//		with useing + opretor
		
		String name = "akshat";
		
		System.out.println(name + "saxena");
		
//		without useing + opretor
		
		StringBuffer sb = new StringBuffer("akshat");
		sb.append("saxena");
		
		System.out.println(sb);
		
		
		
		
	}

}
