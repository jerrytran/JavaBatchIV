package com.class07;

public class Task {

	/*
	 * create a boolean variable workday and assign true
	 * create int variable day and assign it to 1 
	 * as long as it is workDay print ---> "I need a day off" and increment day 
	 * day once day is 6 ---> your condition should becomes false 
	 */
	public static void main(String[] args) {
		
		boolean workDay= true;
		
        int day=1;
        while (workDay) {
        	System.out.println("I need a day off");
        	day++;
            if (day==6) {
            	workDay=false;
            }
        }
        System.out.println("I am off ");
	}

}
