package com.class20;

public class Task2 {
	
	/*
	 * Create a method that will take a string and return whether String us palindrome or not
	 * Method  should be available to all classes within your projects.
	 */

	public static void main(String[] args) {
		
		Task2 obj= new Task2();
		System.out.println(obj.Ispalind("SYS"));
		
		

	}
	
	public boolean Ispalind(String a) {
		
		String palind="";
		
		boolean flag= false;
		for ( int i = a.length() - 1; i >= 0; i-- )  
	         palind = palind + a.charAt(i);  
		
		if (a.equals(palind)) {
			flag= true;
		}
		return flag;
		
	}

}
