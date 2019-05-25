package com.class24;

public class Degree {
	
	public String getDegree() {
		String a="I have a degree";
		System.out.println(a);
		return a;
	}

}

class Undergraduate extends Degree {
	
	public String getDegree() {
		String a="I am an Undergraduate";
		System.out.println(a);
		return a;
	}
}

class Postgraduate extends Degree {
	
	public String getDegree() {
		String a="I am a Postgraduate";
		System.out.println(a);
		return a;
	}
}