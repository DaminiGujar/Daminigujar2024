package com.practice.sumoftwonum;

import java.util.Scanner;

//Write a Java program to find the sum of two numbers.
public class SumOfTwoNum {
	
	public static void main(String[] args) {
		
//	        int num1 = 5;
//	        int num2 = 10;
//	        
//	        int sum = num1 + num2;
		 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
	        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
	    }
	

}
