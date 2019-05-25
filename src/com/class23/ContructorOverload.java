package com.class23;

public class ContructorOverload {

	ContructorOverload() {
        System.out.println("I am a constructor with no parameters");
    }
	ContructorOverload(String str) {
        System.out.println("I am a constructor with 1 String parameter");
    }
	ContructorOverload(String str, String str2) {
        System.out.println("I am a constructor with 2 String parameters");
    }
	ContructorOverload(int a) {
        System.out.println("I am a constructor with 1 integer parameter");
    }

}
