package com.class24;

public class Testing {

	public static void main (String [] args) {
		String a;
		a= "10";
		
		Parent parent=new Parent();
		parent.love();
		parent.work();
		
		Child child=new Child();
		child.love();
		child.cry();
		child.work();
		//Type casting
		
		//Child obj1=new Parent(); not possible
		//Achieving run time polymorphism
		Parent obj=new Child();
		obj.work();//Parent Work
		obj.love();//Child love -- common method 
		//obj.cry();not accessible
	}
}
