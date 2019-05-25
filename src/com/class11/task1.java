package com.class11;

public class task1 {

	public static void main(String[] args) {
		
		String [] countries = {"USA","Afghanistan","Vietnam","Korea"};
		for (String country:countries) {
			switch (country) {
			case "USA":
				System.out.println("Washington DC");
				break;
			case"Afghanistan":
				System.out.println("Kabul");
				break;
			case"Vietnam":
				System.out.println("Saigon");
				break;
			case"Korea":
				System.out.println("Incheon");
				break;
			}
		}

	}

}
