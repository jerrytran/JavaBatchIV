package com.class24;
// Parent Class
public class Bank {
	public int chargeInterest() {
		return 0;
	}

}
//1. Child Class
class BOA extends Bank {
	@Override//annotation
	public int chargeInterest() {
		return 2;
	}
}
//2. Child class
class PNC extends BOA {
	@Override
	public int chargeInterest() {
		return 3;
	}
}

