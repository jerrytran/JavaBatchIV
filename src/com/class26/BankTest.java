package com.class26;

public class BankTest {

	public static void main(String[] args) {


		Bank bank;
		bank = new Bank();
		bank.getBalance();
		
		bank=new BankA();
		bank.getBalance();
		
		bank=new BankB();
		bank.getBalance();
		
		bank=new BankC();
		bank.getBalance();

	}

}
