package com.class25;

public class FinalKeyword {
	/*Final keyword can be used in 3 places/ways
		 * 1. variables - we CANNOT change their value --> CONSTANT
		 * 2. methods - we CANNOT OVERRIDE final methods
		 * 3. classes - we CANNOT create a child of a Final Class--> PREVENT INHERITANCE
		 * 
		 */
	public static final String name="SYNTAX";

	public static void main(String[] args) {
		
		
		final String str="Hello";
		//str="John";
		//name="School";
		
		FinalKeyword obj=new FinalKeyword();
		obj.hello();

	}
    
	public final void hello() {
		System.out.println("Hello from Parent class");
	}
}
class ChildOffinal extends FinalKeyword {
//	CANNOT OVERRIDE FINAL METHOD 
//	public final void hello() {
//		System.out.println("Hello from Parent class");
//	}
}
