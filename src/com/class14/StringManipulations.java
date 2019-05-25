package com.class14;

public class StringManipulations {

	public static void main(String[] args) {

        //1 replace()
		
		String str="I am good tester!";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);
		
		String str1="I am good tester";
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		str=str.replace("!", "?");
		System.out.println(str);
		
		//2
		
		String str0="12Hello 3234 World 465%^%";
		String replacedNonumbers=str0.replaceAll("[0-9]", "");
		System.out.println(replacedNonumbers);
		
		String newString =replacedNonumbers.replaceAll("[^A-Z a-z ]", "");
		System.out.println(newString);
		
		//String replacedNoChar=replacedNonumbers.replaceAll("[A-Za-z]", "");
		//System.out.println(replacedNoChar);
		
		String str2="1Hello123";
		System.out.println(str2.replaceAll("^A-Z", ""));
	}

}
