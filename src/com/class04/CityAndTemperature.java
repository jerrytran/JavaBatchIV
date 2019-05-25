package com.class04;

import java.util.Scanner;

public class CityAndTemperature {
/*
	 * Ask user to enter city and temperature in Fahrenheit
	 * Your program should covert F--C
	 * Your program should say " The temperature in city ___ is __ "	
	 */
	
	public static void main(String[] args) {
	
    String cityName;
    int temp;
    
    Scanner myScanner=new Scanner(System.in);
    System.out.println("Please enter your city");
    cityName=myScanner.nextLine(); 
    
    System.out.println("Please enter city and temperature in Fahrenheit"); 
    temp=myScanner.nextInt();
    //Formula (F - 32) x 5/9
    
    int converterTemp=(temp-32)*5/9;
    
    System.out.println("The temperature in the city "+cityName+ " is "+converterTemp+"C");
    
	}

}
