package com.rays.basic;

public class Print_Table {
	
	public static void main(String[] args) {
		
		for (int i = 1; i<=100 ; i++) {
			for (int j = 1; j <= 100; j++) {
				
				System.out.print(i+"x"+j+"="+i*j+"\t");	
			}
			System.out.println(" ");
			
			
		}
		
	}

}
