package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {


		ArrayList<String> car=new ArrayList<>();
		
		car.add("Toyota");
		car.add("GT-R");
		car.add("BMW");
		
		for(int i=0; i<car.size(); i++) {
			System.out.println(car.get(i));
		}
		
		for(String Car:car) {
			System.out.println(Car);
		}
		
		Iterator<String> car1=car.iterator();
		while(car1.hasNext()) {
			System.out.println(car1.next());
		}


	}

}
