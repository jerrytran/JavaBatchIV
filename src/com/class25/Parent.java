package com.class25;

public class Parent {//Constructor
	
	Parent() {
		System.out.println("I am a parent constructor ");
	}

}

class Child extends Parent{
	Child() {
		System.out.println("I am a child constructor");
	}
}
