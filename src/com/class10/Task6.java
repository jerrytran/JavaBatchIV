package com.class10;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		/*
		 * Ask a user to input a leap gear. Give the user 10 chances to enter a correct leap year.
		 * as soon as the user enters the correct leap year exit the loop
		 * 
		 * Leap year is the year
		 */
		
		Scanner scan;
		int userYear;
		
		scan=new Scanner(System.in);
		
		for (int i=0; i<10; i++) {
			System.out.println("Please enter a guessed leap year");
			userYear=scan.nextInt();
			if (userYear%4==0) {
				System.out.println("The year is a leap year");
			} else {
				System.out.println("THe year is not a leap year");
			}
		}

	}

}
