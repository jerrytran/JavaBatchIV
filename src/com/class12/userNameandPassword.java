package com.class12;

import java.util.Scanner;

public class userNameandPassword {

	public static void main(String[] args) {

      Scanner scan;
      String userName, password, confirmedPassword,message="";
      
      scan=new Scanner(System.in);
      System.out.println("Please enter username");
      userName=scan.nextLine();
      System.out.println("Please enter password");
      password=scan.nextLine();
      System.out.println("Please confirm password");
      confirmedPassword=scan.nextLine();
      
      if (!(userName.isEmpty() && password.isEmpty())) {//1 checkpoint
    	  if (password.length()>8) {//2 checkpoint
    		  if (password.contains(userName)) {//3 checkpoint
    			  
    			  if (password.equals(confirmedPassword)) {
    				  
    			  }else {
    				  message="Passwords do not match";
    			  }
    		  }else {
    			  message="Password cannot contain username";
    		  }
    		  
    	  } else {
    		  message="Password is too short";
    	  }
    	  
    	  
      } else {
    	  message="Username and Password cannot be empty";
      }
          System.out.println(message);

	}

}
