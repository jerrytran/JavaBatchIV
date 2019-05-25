package com.class05;

import java.util.Scanner;

public class ConditionsAll {

	public static void main(String[] args) {
		/*
		 * Ask user to enter prince and boolean value for sale 
		 * Based on the sale we will check the price 
		 * if price<20 --> apply 20% and give final price
		 * if price is >20 less 100--> apply discount 30 % and give final price 
		 * if price is >100 less 500---> apply discount 50% and give final price
		 * 
		 */

		Scanner scan;
		boolean sales;
		int discount;
		int price;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter if there is a sale");
		sales=scan.nextBoolean();
		
		if (sales) {
			System.out.println("Please enter the price of the items");
			price=scan.nextInt();
			
			System.out.println("let's check all discount");
			if (price<20) {
				discount=20;
				finalPrice=price-(price*0.2);
			} else if (price>=20 && price<100) {
				discount=30;
				finalPrice=price-(price*0.3);
			} else if (price>=100 && price<500) {
				discount=50;
				finalPrice=price-(price*0.5);
			} else {
				discount=75;
				finalPrice=price-(price*0.75);
			}
			System.out.println("The final price "+ finalPrice);
		} else {
			System.out.println("Not interested");
		}	
	}
}
