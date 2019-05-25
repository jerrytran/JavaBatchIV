package com.class05;

import java.util.Scanner;

public class Quizcost {

	public static void main(String[] args) {
		int quiz,midterm,finalScore,score;
		
		Scanner grade=new Scanner(System.in);
		System.out.println("Please enter your Quiz");
		quiz=grade.nextInt();
		System.out.println("Please enter your Midterm");
		midterm=grade.nextInt();
		System.out.println("Please enter your Final");
		finalScore=grade.nextInt();
		
		score = (quiz + midterm + finalScore)/3;
		
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 70 && score < 90) {
			System.out.println("B");
		}else if (score >= 50 && score < 70) {
			System.out.println("C");
		}else if (score >= 70 && score < 90) {
			System.out.println("F");
		}

	}

}
