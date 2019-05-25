package com.class05;

public class NestedIf {

	public static void main(String[] args) {
	     
	/*
	 * check if user has credit card ----> 
	 * check what is the balance if balance is more than 1000 ---> pay off
	 * else "you are good"
	 */

		boolean creditCard=true;
		int balance=1000;
		
		if (creditCard) {
			System.out.println("let's check the balance");
			if(balance>=1000) {
				System.out.println("Pay off now");
			} else {
				System.out.println("you are safe");
			}
		} else {
			System.out.println("Do you want a credit card");
		}
	}

}
