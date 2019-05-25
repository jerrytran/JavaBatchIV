package com.class15;

import java.util.Scanner;

public class InterviewQuestion6 {

	public static void main(String[] args) {


		String madam="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter word to check if it a palidrome");
		String word=scan.nextLine();
		
		for (int i=word.length() -1 ; i >=0; i--) {
			madam +=word.charAt(i);
		}
		if (word.equalsIgnoreCase(madam)) {
			System.out.println("The word is palidrome");
		}else {
			System.out.println("The word is not palidrome");
		}

	}

}
