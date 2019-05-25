package com.class24;

public class Programming {
	Programming() {
		System.out.println("I love programming languages");
	}
	
	Programming(String a) {
		System.out.println("programming languages");
	}
    
	public static void main (String [] args ) {
		Programming obj=new Programming();
		Programming obj2=new Programming("Java");
	}
}
