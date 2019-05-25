package com.class22;

public class Gun {

	public String studentName;
	public int q,w,e;

	public Gun(String name1, int a, int b, int c) {
		studentName = name1;
		q = a;
		w = b;
		e = c;
	}

	public void getGun() {
		
		int totalGrade = q+w+e;
		int averageGrade = totalGrade/3;
		String Detail = studentName + " have an Average Grade of " + averageGrade;
		System.out.println(Detail);
	}

}
