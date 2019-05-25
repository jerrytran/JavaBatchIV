package com.class07;

public class OddNumbers {

	public static void main(String[] args) {
	
		int num=1;
		while (num <= 20) {
			System.out.println("I am inside while loop");
			if (num % 2 != 0) {
				System.out.println(num);
			}
			num++;
		}
		
		int num1=10;
		
		while (num1 <=100) {
			System.out.println("Odd");
			if (num1 % 2 !=1) {
				System.out.println(num1);
			}
			num1++;
		}  

	}

}
