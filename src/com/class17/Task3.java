package com.class17;

public class Task3 {

	public static void main(String[] args) {
		
		String a="mommy11";
		
		Task3 obj=new Task3();
		obj.str(a);


	}
	
	void str(String a) {
		
		String reverse="";
		
		for(int i=a.length() -1; i >=0 ; i--) {
			reverse += a.charAt(i);
		}
		if (reverse.equals(reverse)) {
	         System.out.println("The string is a palindrome.");
		}else {
	         System.out.println("The string isn't a palindrome.");
		}
		
	}

}
