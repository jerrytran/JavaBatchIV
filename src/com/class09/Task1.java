package com.class09;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		String a = "";
		double price;
		double pay;
        Scanner scan2 = new Scanner(System.in); 
		Scanner item = new Scanner(System.in);
		System.out.println("Please, Enter the item");
		a = item.nextLine();
		System.out.println("Please, Enter the price of the item");
		price = item.nextInt();
		System.out.println("Please, Insert your money to pay");
		pay=item.nextDouble();
		
		
	    
			while (pay<price) {
				System.out.println("Please pay:"+(price-pay)+" left");
				System.out.println("Please, Insert your money to pay");
				
				pay = pay + scan2.nextInt();
			 
			 if (pay>price) {
				System.out.println("Thank you for shopping! " + "Here your change:" +(price-pay));
				break;
			} else if (pay==price){
				System.out.println("Thank you for shopping, Please come back next time");
			}
		
			}
	}

}
