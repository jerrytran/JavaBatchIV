package com.class04;

import java.util.Scanner;

public class DmvRepresentative {

	public static void main(String[] args) {
		int age;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("How old are you?");
		
		age=scan.nextInt();
		
		if (age>18) {
			System.out.println("I will issue a driver licence to you.");
		} else {
			System.out.println("You should get a learners permit first.");
		}

	}

}
