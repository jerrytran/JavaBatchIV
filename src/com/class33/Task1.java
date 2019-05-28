package com.class33;

import java.util.*;

public class Task1 {
	
	public static void main (String [] args) {
		Map<Integer, String> floor =new HashMap<>();
		floor.put(1, "Google");
		floor.put(2, "Syntax");
		floor.put(3, "Facebook");
		floor.put(4, "Snap CHat");
		floor.put(5, "Intergram");
		floor.put(6, "Amazon");
		floor.put(7, "Bing");
		System.out.println(floor);// print out the floor
		System.out.println(floor.size());//print out the size
		
		floor.replace(4, "Gopro");// replace the Snap chat to Gopro
		System.out.println(floor.get(4));//print out
		
		floor.remove(7);// Remove complete the floor
		
		System.out.println(floor);
	}

}
