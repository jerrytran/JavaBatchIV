package com.class05;

import java.util.Scanner;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/*
		 *   "&&" is And 
		 * ask user to enter age based on the age we will print:
		 * if age is older than 1 but less then 3---> baby
		 * if age is older than 3 but less than 5---> toddler
		 * if age is older than 5 but less than 12--->kid
		 * if age is older than 12 but less than 20--->teenager 
		 * if age is older than 20 but less than 64---> adult 
		 * if age id older than 64 or equal to 64 ---> senior
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		if (age>=1 && age < 3) {
			System.out.println("Baby");
		} else if (age>=3 && age<5 ) {
			System.out.println("Toddler");
		}else if (age>= 5 && age<12) {
			System.out.println("Kid");
		}else if (age>= 12 && age<20) {
			System.out.println("Teenager");
		}else if (age>= 20 && age<64) {
			System.out.println("Adult");
		}else  {
			System.out.println("Senior");
		}	
	}

}
