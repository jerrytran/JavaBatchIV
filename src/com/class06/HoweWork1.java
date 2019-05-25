package com.class06;

import java.util.Scanner;

class Main {
  public static void main (String [] args) {
    boolean q;
    int score;
    String run1 = null;
    Scanner scan=new Scanner(System.in);
    System.out.println("Do you need a loan?");
    q=scan.nextBoolean();
    
    if (q) {
      System.out.println("What is your credit score?");
      score=scan.nextInt();
      if (score<600) {
        run1="Not eligible";
      } else if (score>=600 && score<=700) {
        run1="Maybe eligible";
      } else if (score>=701 && score<=800) {
        run1="Eligible";
      } else if (score>800) {
        run1="Definitely Eligible";
      }
      
    } else {
      run1="Unknown";
    }
    System.out.println("The eligibility is "+ run1);
  }

}
