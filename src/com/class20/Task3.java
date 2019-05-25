package com.class20;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a method that will take a string and return an array of words from that string.
		 * method should be available only within same class.
		 */
		Task3 obj =new Task3();
		String[] array=obj.getWordsFromString("Have a good night");
		
		for(int i=0; i<array.length; i ++) {
			System.out.println(array[i]);
		}
		for (String word:array) {
			System.out.println(word);
		}

	}
	
	private String [] getWordsFromString(String str) {
		String[] words=str.split(" ");
		return words;
	}
	

}
