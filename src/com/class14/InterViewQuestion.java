package com.class14;

public class InterViewQuestion {

	public static void main(String[] args) {

  
		
		
		// 1. Write a program to swap 2 numbers without a temporary variable? Swap  2 strings without a temporary variable? 
		System.out.println("---Task: 1----");
		int x,y,swap;
		
		x=5;
		y=10;
		System.out.println("X and Y before Swap:" + "x=" + x +" y=" + y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(" x=" + x +" y=" + y );
		
		String a,b,swap1;
		
		a="Do a first then b";
		b="Do b first then a";
		System.out.println("Before swap a and b: " + a + ", " + b);
		
		a=a+b;
		b=a.substring(0, a.length() - b.length());
		a=a.substring(b.length());
		System.out.println("After swap a and b: " + a + ", " + b);
		
		// 2.Write a java program to find the second largest number in the array? Maximum and minimum number in the array?
int [] array = {-1,5,2,3,8,5,9};
        
        int largest=array[0];
                
        int min = array[0];
                
        int secondLargest=0;
        
        for (int i=0; i<array.length; i++) {
            
            int num = array[i];
        
        if (num>largest) {
            secondLargest=largest;
            
            largest = num;
        }else if (num>secondLargest) {
            
            secondLargest = num;
        
        }else if (num<min) {
            
            min = num;
        }
        
        }
        System.out.println("The second largest number in the array is " +secondLargest);
        System.out.println("The largest number is the array is " + largest);
        System.out.println("The smallest number in the array is " +min);

    

		//3.Find out how many alpha characters present in a string?
		System.out.println("---Task: 3---");
		String str="How many alpha character in this question?";
		
		int str1=str.length();
		
		System.out.println(str1);
		
		//4.How to find out the part of the string from a string? What is substring? Find number of words in string?
		System.out.println("---Task: 4---");
		
		String str2="New Syntax Questions";
	       String[] array1=str2.split("Syntax");
	       
	       int str3=str2.length();
	       System.out.println("The length of the array is "+array1.length);
	       for(String substring: array1) {
	           System.out.println(substring);
	       }
	       System.out.println("-----------");
	       for(int i=0;i<array1.length; i++ ) {
	           System.out.println(array1[i]);
	    }
	       System.out.println("There are "+str3+ " words in this string");
	       
		
		//5.Write a java program to reverse String? Reverse a string word by word? 
	       System.out.println("---Task: 5---");
	     String reverse="";
         String beforeReverse = "Today in Java Class I will be reversing a string";
         
         for(int i = beforeReverse.length(); i>0; i--) {
             reverse+=beforeReverse.substring(i-1,i);
         }
         System.out.println("Reverse String is: " + reverse);
         
         String[] words = reverse.split(" ");
         for (int i=words.length-1; i>=0;i--) {
        	 System.out.println(words[i]+" ");
         }

	}

}
