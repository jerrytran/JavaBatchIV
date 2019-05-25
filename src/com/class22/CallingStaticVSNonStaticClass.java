package com.class22;

public class CallingStaticVSNonStaticClass {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
		System.out.println(obj.name);
		// acceess static members by using classname They belong to 
		System.out.println(StaticVsNonStatic.lastName);
		StaticVsNonStatic.getInfo1();
		

	}

}
