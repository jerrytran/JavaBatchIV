package com.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		
		for (int i=0; i<6; i++) {
			if (i==4) {
				continue;
			}
			System.out.println(i);
		}

		
		/* I want to print number from 1 to 20 but skip those that divisible by 3**/
		
		  for (int a=1; a <=20; a++) {
	            
	            if (a%3==0) {
	                continue;
	            }
	            
	            System.out.println(a);
		  }
	}

}
