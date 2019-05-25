package com.class04;

import java.util.Scanner;

public class loanSpecialist {

	public static void main(String[] args) {
		
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amount of loan you need?");
		
		num=scan.nextInt();
		
		if (num<200000) {
			System.out.println("I would lend you the money.");
		} else {
			System.out.println("I wouldn't lend you the money.");
		}

	}

}
