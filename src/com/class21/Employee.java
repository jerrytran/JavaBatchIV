package com.class21;

public class Employee {

	static String CEO="Sumair";
	int eID;
	int salary;
	
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		Employee obj1 = new Employee();
		
		
		
		obj.eID=15600;
		obj.salary=50000;
		obj.getPrint();
		
		obj1.eID=16624;
		obj1.salary=100000;
		obj1.getPrint();
		
		

	}
	public void getPrint() {
		System.out.println("eID:" +eID + " Salary:" +salary +" CEO:"+ CEO);
	}

}
