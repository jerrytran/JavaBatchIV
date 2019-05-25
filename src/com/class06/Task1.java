package com.class06;

import java.util.Scanner;

public class Task1 {

	

	public static void main(String[] args) {
		/*
		 * write a program that prints out if it is good weather to go for any activity.
		 * The weather is good if the temperature is between 40 degrees and 80 degrees
		 * inclusive --> we will go for hiking unless it is raining --> we will not go hiking otherwise we go hiking
		 * if temperature is between 25 and 40 inclusive & snow --> we will go snowboard --->it is too cold---> not snowboard
		 *  it if temperature is more than 80 & sunny--> go to the beach 
		 *  otherwise --> not go to the beach
		 */

		int temp;
		boolean snow,rain,sunny ;
		String activity;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the temperature outside?");
		temp=scan.nextInt();
		
		
		if (temp>=40 && temp<80) {
			System.out.println("Is it raining outside?");
	        rain=scan.nextBoolean();
			if (rain) {	
				activity= "Stayhome"; 
			} else {
				activity="Go hiking";
			}
		} else if (temp>=25 && temp<40) {
			System.out.println("Is it snowing outside?");
		        snow=scan.nextBoolean();
			if (snow) {			
				activity="Snow boarding";
			}else {
				activity="Not snowboarding";
			}
		} else if (temp >=80) {
			System.out.println("Is it sunny outside?");
	        sunny=scan.nextBoolean();
			if (sunny) {
				activity="Go to the beach";
			} else {
				activity="More coding";
			}
		} else {
			System.out.println("Please enter different temperature");
			activity="unknown";
		}
		  System.out.println(activity);
	}

}
