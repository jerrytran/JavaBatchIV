package com.class12;

public class StringManipulation2 {

	public static void main(String[] args) {


		String str="Goodmorning,student!";
		
		boolean contains=str.contains("student");
		System.out.println(contains);
		
		//contains() --> checks for specific value in the string
        //if value is present--> true , else--> false
		String present="Welcome, mehmet";
		String neededValue="WELCOME;";
		
		boolean flag=present.contains("Welcome,");
		System.out.println(flag);
		
		boolean flag1=present.toUpperCase().contains(neededValue);
		System.out.println(flag1);
		
		//startsWith(), endsWith(), --> will return true if String starts/ends with specific value
        //else --> false

		String str1="syntax";
		
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("y"));
		
		
		//isEmpty() if length of a string is =0--> string is empty else -> it is not
		
		System.out.println("_____isEmpty()______");
		String str2="";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		//concat() --> will concatenate 1 string to the end of another
		System.out.println("______contact()______");
		String str3="Hello";
		String str4="Ali!";
		
		System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//trim()--> will remove spaces at the beginning and at the end of your String
        System.out.println("_______--________");
        String expected="You may qualify for a multi-policy discount!";
        String actual=" You may qualify for a multi-policy discount! ";
        
        actual=actual.trim();
        System.out.println(expected.equals(actual));
		

	}

}
