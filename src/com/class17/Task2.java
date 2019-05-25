package com.class17;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Task2 num=new Task2();
		num.odd(5);

	}
	
	void odd(int a) {
		if (a %2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

}
