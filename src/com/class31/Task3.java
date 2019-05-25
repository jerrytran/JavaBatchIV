package com.class31;

import java.util.ArrayList;

public class Task3 {

	public static void main(String[] args) {

		
		 ArrayList <String> soda=new ArrayList<String>();
		    soda.add("Sprite");
		    soda.add("Cola");
		    soda.add("Fanta");
		    
		    for(int i=0;i<soda.size();i++) {
		       String y=(String) soda.get(i);
		       if(y.contains("a")||y.contains("e")) {
		          soda.set(i, "water");
		       }
		       }System.out.println(soda);
	}

}
