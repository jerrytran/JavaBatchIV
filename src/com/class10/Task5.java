package com.class10;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		/*
		 * write a guessing game where the user has to guess a secret number between 1 and 20
		 * after every guess input, the program tells the user weather their number was too large 
		 * or too small. The program will keep asking the user to enter number until
		 * he finds the correct number. when the correct answer is found
		 */

		Scanner scan;
		int secret,userNumber;
		scan=new Scanner(System.in);
		secret=13;
		System.out.println("Please guess the secret number from 1 to 20");
		do {
			
			
			userNumber=scan.nextInt();
			
			if (userNumber<secret) {
				System.out.print("Number is too small");
			} else if (userNumber>secret) {
				System.out.print("Number is too large");
			} 
		} while (secret!=userNumber);
		System.out.print("Congratulations!You got it");
	}

}
