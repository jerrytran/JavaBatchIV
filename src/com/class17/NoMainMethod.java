package com.class17;

public class NoMainMethod {

	String str;
	int num;
	
	void hello() {
		System.out.println("Hello");
	}
	void bye() {
		System.out.println("Bye");
	}
	public static void main (String[] args) {
		NoMainMethod obj=new NoMainMethod();
		obj.hello();
		obj.bye();
	}
	
	void howAreYou() {
		System.out.println("How are you?");
	}
}
