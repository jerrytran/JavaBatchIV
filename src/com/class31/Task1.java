package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
	public static void main (String [] args) {
		ArrayList<String> word=new ArrayList<String>();
		
		word.add("Home");
		word.add("baba");
		word.add("bebe");
		word.add("emies");
		
		for (int i=0; i<word.size(); i++) {
			word.get(i);
		}
		
		Iterator<String> it=word.iterator();
		while(it.hasNext()) {
			String obj=it.next();
			if(obj.endsWith("e")) {
				it.remove();
			}
		}
		
		System.out.println(word);
	}

}
