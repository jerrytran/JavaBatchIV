package com.class05;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * based 
		 */

		Scanner scan;
		int sales;
		int comission;
		scan= new Scanner(System.in);
		System.out.println("Please enter sales amount");
		sales=scan.nextInt();
		
		if (sales>0 && sales<100) {
			comission=2;
		}else if (sales>=100 && sales<200) {
			comission=5;
		}else if (sales>=200 && sales<500) {
			comission=10;
		}else if (sales>=500) {
			comission=20;
		} else {
			comission=0;
		}
		System.out.println("your comission is "+comission);
		
	}

}
