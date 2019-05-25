package com.class04;

import java.util.Scanner;

public class ScannerClass1 {

	public static void main(String[] args) {
		//ask user for the name and print Good Morning
		
		Scanner user=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=user.nextLine();
		
		System.out.println("Good Morning " + name);
				
	}

}
