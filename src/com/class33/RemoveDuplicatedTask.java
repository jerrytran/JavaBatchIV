package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatedTask {
 
	public static void main(String[] args) {
		List<String> aList=new ArrayList<String>();
		aList.add("John");
		aList.add("Jame");
		aList.add("James");
		aList.add("Jamie");
		aList.add("Jame");
		aList.add("John");
		System.out.println("Array with duplicated "+ aList);
		
		Set<String> aListRemove = new HashSet<>(aList);
		System.out.println("Array after remove duplicated "+ aListRemove);
		System.out.println(aListRemove.size());

	}

}
