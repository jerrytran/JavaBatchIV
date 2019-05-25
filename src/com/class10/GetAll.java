package com.class10;

public class GetAll {

	public static void main(String[] args) {
		
		String[] names= {"John", "Mike", "Jane", "Talgat", "Olga","Mehmet","Siyar"};
		
		int a=3;
		System.out.println(names[a]);
		
		a+=2;
		
		System.out.println(names[a]);
		
		a-=4;
		
		System.out.println(names[a]);
        
		int size=names.length;
		
		System.out.println(size);
		
		for (int i=1; i<size; i++) {
			System.out.println(names[i]);
		}
	}

}
