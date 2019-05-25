package com.class25;

public class Payment {

	public void makePayment() {//override method 
		System.out.println("We can make a payment with no fee");
	}
	public void closePayment() {
		System.out.println("We can't make a payment ");
	}
	
}

class MasterCard extends Payment {
	public void makePayment() {//override method 
		System.out.println("We can make payment with MC and 2% fee");
	}
}
class Visa extends Payment {
	public void makePayment() {//override method 
		System.out.println("We can make payment with Visa and 1.5% fee");
	}
	public void annualFee() {//override method 
		System.out.println("We can make payment with Visa and 2.5% fee");
	}
}