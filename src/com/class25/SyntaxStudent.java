package com.class25;

public class SyntaxStudent extends Student {

	public void study() {
		System.out.println("Syntax Students must study hard");
	}
	
	public void doHomeWork() {
		System.out.println("Syntax student must do REPL");
	}
	
	public void attendClasses(int num,String str) {
		System.out.println("Syntax student must attend to classes and takes note");
	}
	//private method cannot be override
	private void doResearch() {
		System.out.println("Syntax student must make uncle Google as best friend");
	}
}
