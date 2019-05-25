package com.class25;

public class Student {
	
	public void study() {
		System.out.println("Students must study");
	}
	
	protected void doHomeWork() {
		System.out.println("Student must do homework");
	}
	
	 void attendClasses(String str,int num) {
		System.out.println("Student must attend to classes");
	}
	//creating child specific private method  
	private void doResearch() {
		System.out.println("Student must do research");
	}

}
