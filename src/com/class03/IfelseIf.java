package com.class03;

public class IfelseIf {

	public static void main(String[] args) {
		
//		int num1 = 23;
//		int num2 = 19;
//
//		if (num1 > num2) {
//			System.out.println("I am if block");
//			System.out.println("Num1 is larger than Num2");
//		} else {
//			System.out.println("Num1 is smaller than Num2");
//			System.out.println("I am else block");
//		}

		

//		int num1 = 230;
//		int num2 = 23;
//
//		if (num1>num2) {
//			System.out.println("Num1 is larger than num2");
//		} else if (num1==num2){
//			System.out.println("Num1 is equal to num2");
//		} else {
//			System.out.println("Num1 is smaller than num2");
//		}
		
		
		/*
		 * Create a java program and declare int variable that will hold a day
		 * Based on the value of the variable your program should print
		 * the name of the day
		 */
	
	int day=10;
	
	if (day==1) {
		System.out.println("Monday");
	}else if (day==2) {
		System.out.println("Tuesday");
	}else if (day==3){
		System.out.println("Wednesday");
	}else if (day==4){
	    System.out.println("Thursday");
	}else if (day==5){
		System.out.println("Friday - funday");
	}else if (day==6) {
		System.out.println("Saturday -code day");
	}else if (day==7) {
		System.out.println("Sunday");
	}else {
		System.out.println("Please choice numbers from 1 to 7 only!");
	}
	
	
	}

}
