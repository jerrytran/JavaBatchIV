package com.class16;

public class Task {
      
	String brand;
	int openApplication;
	boolean multipleTask;
	
	public static void main(String[] args) {
		
		Task phone1=new Task();
		phone1.brand="Iphone";
		phone1.openApplication=10;
		phone1.multipleTask=false;
		phone1.Apps();
	
		Task phone2=new Task();
		phone2.brand="Android";
		phone2.openApplication=10;
		phone2.multipleTask=true;
		phone2.Apps();
		phone2.battery();

		Task phone3=new Task();
		phone3.brand="Nokia";
		phone3.openApplication=5;
		phone3.multipleTask=false;
		phone3.Case();
		
	}
	
	void Apps() {
		System.out.println(brand+ " can open 10 or more apps");
	}
	
	void battery() {
		System.out.println(brand+ " battery servive the whole day");
	}
	
	void Case() {
		System.out.println(brand+ " very hard to break");
	}

}
