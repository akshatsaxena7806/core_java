package com.rays.basic;

import java.util.Scanner;

public class Switch_Example {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a number (1-7)");
		
		int number= sc.nextInt();
		
		String day ;
		
		switch(number) {
		case 1:
			day="sunday";
			break;
		case 2:
			day ="monday";
			break;
		case 3:
			day="whnsdy";
			break;
		case 4:
			day="thusday";
			break;
		case 5:
			day="friday";
			break;
		case 6:
			day="struday";
			break;
		case 7:
			day="sunday";
			break;
			
			default:
				day="invaild";
				break;
			
			
		}
		System.out.println("the day is :"+day);
		

	}

}
