package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {

		/*
		 * Prompt user to ask the name 3 times and print " you are doing great ____"
		 * 
		 */
        Scanner scan;
        String name;
        
        scan=new Scanner(System.in);
        
        int a=3;
        
        while(a<=5) {
        	System.out.println("Please enter your name");
        	name=scan.nextLine();
        	
        	System.out.println("You are doing great "+name);
        	a++;
        }
	}

}


     /*
      * ask user to pay for a soda
      * keep asking user to pay for soda until entered price is not equal to 1.99
      * after user got a write amount print " please enjoy your soda" */
