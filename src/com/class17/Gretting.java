package com.class17;

public class Gretting {
	
	public static void main (String[] args) {
		Gretting obj =new Gretting();
		obj.hello();
		//how to find larger number
		obj.findLargest(20, 10);
		obj.findLargest(30,31);
		obj.findLargest(2000, 6664674);
		obj.helloToInstructor("Asel");
		obj.helloToInstructor("Arif");
		
	}
	void hello() {
		System.out.println("Hello");
	}
	
	void helloToInstructor(String name) {
		System.out.println("Hello " +name);
	}
	void findLargest(int a, int b) {
		
		
		if (a>b) {
			System.out.println("A is larger than B");
		} else {
			System.out.println("B is larger than A");
		}
	}

}

