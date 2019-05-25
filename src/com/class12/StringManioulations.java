package com.class12;

public class StringManioulations {
	public static void main (String [] args) {
		
		String str="Syntax";
		
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		
		int lengthof2String=str1.length();
		System.out.println(lengthof2String);
		
		String str2="Welcome, Students!";
		System.out.println(str2.length());
		
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		
		String str4="Hello";
		String str5="ello";
		
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality);
		
		String expectedBrowser="chrome";
		String actualBrowser="CHROME";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		
	System.out.println(equals);
		
		
		
				
	}

}
