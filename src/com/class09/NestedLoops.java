package com.class09;

public class NestedLoops {

	public static void main(String[] args) {

		for (int i = 0; i <= 9; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i <= 9; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i = 0; i <= 9; i++) {
			System.out.print(i);
		}
		System.out.println();
         
		System.out.println("-----------------");
		
		for (int i=1; i<5; i++) {
        	 for (int y=1; y<9; y++) {
        		 System.out.print(y);
        	 }
        	 System.out.println();
         }
         
         /*
          * I want to print pattern 
          * 1111111 --> rows = 7 column = 7
          * 2222222
          * 3333333
          *
          */
         
		System.out.println("-----------------");
		
         for (int i=1;i<=7; i++) {
        	 for (int y=1; y<=7; y++) {
        		 System.out.print(i);
        	 }
        	 System.out.println();
         }
         
        
         System.out.println("-----------------");
         
          /*
          * print 54321
          */
         for (int i=1;i<5; i++) {
        	 for (int y=5; y>=1; y--) {
        		 System.out.print(y);
        	 }
        	 System.out.println();
         }
	}

}
