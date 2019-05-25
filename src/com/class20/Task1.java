package com.class20;

public class Task1 {
	
	/*
	 * Create a method that will take 1 parameter as a String and return reversed String.
	 * Method should be visibly only within same package.
	 */
	static String reversed = "";

	public static void main(String[] args) {
		
		Task1 obj=new Task1();
		
		obj.reversed("This is a test");
		System.out.println(reversed);

	}

	 protected String reversed(String sentence) {
		
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reversed += sentence.charAt(i);
		}
		return sentence;
	}

}
