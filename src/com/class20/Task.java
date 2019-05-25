package com.class20;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		/*
		 * 1. Create a method createEmail().
		 * Based on provided usersName, lastName and email type; 
		 * Your method should return complete email Address;
		 * johnsnow@gmail.com 
		 * johnsnow@yahoo.com
		 * 
		 */
		Task obj = new Task();
		String email = obj.createEmail("John", "Snow", "gmail");
		System.out.println(email);

		email = obj.createEmail("Bob", "Snow", "outlook");
		System.out.println(email);
		
		
		char grade=obj.getGrade(79);
		System.out.println("Your grade is " +grade);
		

	}

	// Return type methodName
	String createEmail(String name, String lastName, String emailType) {

		String email = name + lastName + "@" + emailType + ".com";
		return email.toLowerCase();
	}
	
	
	/*
	 * Create class student that will have a method getGrade
	 * your method should accept the score of a student and return a grade
	 * score > 90 - A
	 * score >80 - B
	 * score >70 - C
	 * score >50 - D
	 * anything else - F
	 */
	
	char getGrade(int a) {
		char score=0;
		if (a>=90) {
			score='A';
		} else if (a>=80 && a<90) {
			score='B';
		}else if (a>=70 && a<80) {
			score='C';
		}else if (a>=60 && a<70) {
			score='D';
		}else {
			score='F';
		}
		return score;
	}

}
