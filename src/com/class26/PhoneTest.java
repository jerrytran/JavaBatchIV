package com.class26;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("--Object of parent class--");
		Phone phone=new Phone();
		phone.hasCamera();
		phone.makeCall();
		
		System.out.println("--Object of iPhone class--");
		iPhone iphone=new iPhone();
		iphone.hasCamera();
		iphone.makeCall();
		
		System.out.println("--Object of Samsung class--");
		Samsung samsung=new Samsung();
		samsung.makeCall();
		samsung.hasCamera();
		
		System.out.println("--Object of Nokia class--");
		Nokia nokia=new Nokia();
		nokia.makeCall();
		nokia.hasCamera();
		
		System.out.println("--Object of iphone referring to the Parent class--");
		Phone p=new iPhone();
		p.makeCall(); //Read the parent class but when print out the child class
		p.hasCamera();
		
		System.out.println("--Object of Nokia class--");
		Phone p1=new Nokia();
		p1.makeCall();
		p1.hasCamera();
		//p1.cannotBreak(); ce: method is undefined 
		
		Phone parentPhone;
		parentPhone =new iPhone();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		parentPhone =new Samsung();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		
		parentPhone =new Nokia();
		parentPhone.makeCall();
		parentPhone.hasCamera();
		

	}

}
