package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		/*
		 * Create a grocery list: fruits{}
		 *                        Veggies {}
		 *                        dairy{}           
		 *                        Retrive all value using 2 different loops 
		 */
		
		String [][] food= {
				{"Fruite","Orange","Apple"},
				{"Veggies","potato","Cucumber"},
				{"Dairy","cheese"},
		};
		
		for (int i=0; i<food.length; i++) {
			for (int e=0; e<food[i].length; e++) {
				System.out.print(food[i][e]+",");
			}
			System.out.println();
		}

	}

}
