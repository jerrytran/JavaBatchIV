package com.class08;

import java.util.Scanner;

public class Hw {

	public static void main(String[] args) {

	   double price;
       Scanner scan=new Scanner(System.in);
      
       do {
          System.out.println("Please pay for the soda ");
          price=scan.nextDouble();
       } while(price!=1.99); 
       
       System.out.println("Please enjoy your soda ");
	}

}
