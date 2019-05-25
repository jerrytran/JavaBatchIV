package com.class36;

public class Task1 {
	
	// create an exception: when user it trying to withdraw larger amount that the balance 
	//throw an exception saying "You do not have enough money"

	static int balance=1000;

	public static void main(String[] args) {
		WithDraw(1500);

	}
	
	public static void WithDraw(int enterAmount) {
		if(enterAmount<balance) {
			System.out.println("Please, take your money");
		} else {
		throw new ArithmeticException("you don't have enought money");
		}
	}

}
