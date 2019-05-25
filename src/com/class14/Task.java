package com.class14;

public class Task {

	public static void main(String[] args) {
		// Task 1 
		
		String str="This is a sentence";
		String newstr = str.replace(" ", "");
		System.out.println(newstr);
		
		
		//Task 2
		
		String str1="JerryTran3011";
		char [] array = str1.toCharArray();
		
		for (int i=0;i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//Task 3
		
		String a="Is it Saturday! Is it raining! Do we have a Java Class today? You still have class";
		String [] array1=a.split("! ?");
		System.out.println("This is the numbers of centense "+array1.length);
		
				
	

	}

}
