package com.class05;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/*
		 * if number is between 1-100 ---> number is small
		 * if number is between 11-100---> number is medium
		 * if number is between 101-1000---> number is larger
		 */
		
		int num=15;
		// true And false ---> fasle
		if (num>=1 && num <=10) {
			System.out.println("number is small");
			// true And true ---> true
		} else if (num>=11 && num<=100) {
			System.out.println("number is medium");
			// false And true ---> false
		} else if (num>=101 && num <=1000) {
			System.out.println("number is medium");
		} else {
			System.out.println("number is out of our range");
		}
	}

}
