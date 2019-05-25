package com.class22;

public class ContructorTypes {
	
//	ContructorTypes() {
//		System.out.println("I am a constructor with no parameters");
//	}
	
	ContructorTypes(String str) {//str- is a local variable to a constructor
		System.out.println("I am a constructor with with 1 parameter "+str);
	}
	
	ContructorTypes(int a, String str) {
		System.out.println("I am a constructor with no parameters"+a+" and"+str);
	}
	public static void main (String [] args) {
		ContructorTypes obj1 = new ContructorTypes("String1");
		
		ContructorTypes obj2 = new ContructorTypes("String");
		
		ContructorTypes obj3 = new ContructorTypes(123, "String");
		
	}
	
	

}
