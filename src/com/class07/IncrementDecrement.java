package com.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int x=1;
		x=x+1;
		System.out.println(x);
		
		int y=1;
		y+=1;
		System.out.println(y);
		
		int z=1;
		z++;
		System.out.println(z);
		
		int w=2;
		w++;
		System.out.println(w);
		
		int v=10;
		v--;
		System.out.println(v);
		
		int a=10;
		int c=10;
		int b=++a; // preincrement = first increment ---> assign
		int d=c++; // postincrement = first assign ---> increament 
		
		System.out.println(b);//11
		System.out.println(a);//11 
		System.out.println("Value of d is " +d);//10
		System.out.println(c);//11	
		
		int q=100;
		int e=q--;
		
		System.out.println("value of e is " +e);//100
		System.out.println("value of q is "+q);//99
		
		int h=50;
		int g=--h;
		
		System.out.println("value of h is "+h);//49
		System.out.println("value of g is "+g);//49

	}

}
