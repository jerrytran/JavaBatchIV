package com.class03;

public class Relationaloperators {

	public static void main(String[] args) {
		
		int a=501;
		int b=501;
		
		boolean result=a>b;
		boolean result1= a==b;	
			
		System.out.println(result);
		System.out.println(result1);
		
        //compare 2 numbers and if a is larger than b --> print
		if (a>=b) {
			System.out.println("a is larger than b");
		} else {
			System.out.println("b is larger than a");		
		}
	   
	    //declare price and if price is higher than expected price --> I will not buy it
		
		double shoesPrice=5.99;
		double allowedPrice=31.99;
		
		if (shoesPrice <= allowedPrice) {
			System.out.println("I will buy it");
		} else {
			System.out.println("I will not buy it");
		}
		
	}

}
