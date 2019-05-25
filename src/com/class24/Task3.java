package com.class24;

public class Task3 {
	private void User() {
		System.out.println("This is the Joker");
	}
	
	private void User(String a) {
		System.out.println("This is not the class");
	}
	
	private void User(int a) {
		System.out.println("This is a number");
	}
	
	public static void main(String[] args) {
		Task3 obj=new Task3();
		obj.User();
		obj.User(1);
		obj.User("java");

	}
}
