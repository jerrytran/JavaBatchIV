package com.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main (String [] args) {
	    boolean thirsty,sleepy;
	    String user="";
	    
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Are you thirsty?");
	    thirsty=scan.nextBoolean();
	    System.out.println("Are you sleepy?");
	    sleepy=scan.nextBoolean();
	    
	    if (thirsty= true ) {
	      user="Water";
	    } else if (thirsty==thirsty || sleepy==sleepy) {
	     user="Coffee"; 
	    } else if (sleepy= true) {
	      user="Tea";
	    } else {
	      user="Nothing";
	    }
	    System.out.println("Looks like you need "+ user);
	  }

	}