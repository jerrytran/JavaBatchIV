package com.class24;

public class Parent {

	public void love() {
		System.out.println("Parent love");
	}
	public void work() {
		System.out.println("Parent work");
	}
}

class Child extends Parent{
	public void love() {
		System.out.println("Child love");
	}
	public void cry() {
		System.out.println("Child cry");
	}
}