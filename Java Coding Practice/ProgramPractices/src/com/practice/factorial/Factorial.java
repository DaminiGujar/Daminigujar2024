package com.practice.factorial;


//Write a Java program to calculate the factorial of a number.

public class Factorial {
	
	 public static void main(String[] args) {
		 
	        int number = 5; //5*4*3*2*1
	        
	        int factorial = 1;
	        
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;    // factorial = factorial * i;
	        }
	        
	        System.out.println("The factorial of " + number + " is: " + factorial);
	    }

}
