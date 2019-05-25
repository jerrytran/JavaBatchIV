package com.class18;

public class Application {

	public static void main(String[] args) {
		ScannerMethod scnMthd= new ScannerMethod();
		System.out.println(scnMthd.sum(123,150));
		
		Application app= new Application();
		System.out.println(app.example6('a'));

	}
	
	void example() {
		System.out.println("no return value bith Parameter : ");
	}
	void example2(String name) {
		System.out.println("no return value bith Parameter : " + name);
	}
	boolean example3() {
		System.out.println("no return value bith Parameter : ");
		return true;
	}
	String example4(String name) {
		System.out.println("no return value bith Parameter : "+ name);
		return name;
	}
	boolean example5(String name) {
		System.out.println("no return value bith Parameter : "+ name);
		return false;
	}
	char example6(char name) {
		System.out.println("no return value bith Parameter : "+ name);
		return name;
		
	}

}
