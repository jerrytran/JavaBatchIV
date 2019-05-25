package com.class19;

public class Animal {
	String breed = "cat";
	int weight = 15;
	int age  = 1;
	String name = "Lucia";
	
	
	void name() {
		System.out.println( "This " + breed+ " name " + name);
	}
	
	void weight() {
		System.out.println("It is " + weight +" kg" + " and It is " + age + " years old ");
	}

}
