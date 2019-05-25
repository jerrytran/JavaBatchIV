package com.class18;

import java.util.Scanner;

public class ScannerMethod {
	public static void main (String [] args) {
		ScannerMethod num1=new ScannerMethod();
		
		Scanner scan=new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(num1.sum(a, b));
		//num1.sum(2, 3);
		//num1.sub();
		
	}
	
	protected int sum( int a, int b) {
		//System.out.println(x+y);
		
		return a+b;
	}
	
	void sub() {
		int a=10, b=10;
		System.out.println(a+b);
	}

}
