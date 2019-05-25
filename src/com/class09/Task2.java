package com.class09;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		int input,input2;
		int sum=0;
		int sum2=0;
		Scanner a=new Scanner(System.in);
		System.out.println("Please enter your 2 inputs");
		input=a.nextInt();
		input2=a.nextInt();
		
		for (int i=input; i<input2; i++  ) {
			
			if (i%2==0) {
				sum=sum+i;
			} else {
				sum2=sum2+i;
			}
			
		}
		System.out.println("Sum of even number is " +sum+", Sum of odd number is "+sum2);
		

	}

}
