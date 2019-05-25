package com.class17;

public class Task1 {

	public static void main(String[] args) {
		
		Task1 num=new Task1();
		num.greater(10,50);


	}
	
	void greater(int a, int b) {
		
		if (a>b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");
		}
	}

}
