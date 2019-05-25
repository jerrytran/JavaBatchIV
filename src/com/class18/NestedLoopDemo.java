package com.class18;

public class NestedLoopDemo {

	public static void main(String[] args) {
		NestedLoopDemo num=new NestedLoopDemo();
		num.printNumber();
	
		
	}
		
	void printNumber() {
		for (int i=1; i<=7; i++) {
			for (int y=5; y>=1; y--) {
				
				System.out.print(y);
				
	     }	
			System.out.println();
		}
	
	}
}
