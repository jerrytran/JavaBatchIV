package com.class13;

public class StringReview {

	public static void main(String[] args) {
		
		String day = new String("Thrusday!");
		
		if (!day.isEmpty()) {
			if (day.length() %2!=0 && day.length()>=3) {
				System.out.println(day.charAt(day.length()/2));
			}
		}
	}

}
