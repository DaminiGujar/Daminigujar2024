package com.practice.reversestring;


//Implement a Java program to reverse a string.
public class StringReverse {
	
	
	 public static void main(String[] args) {
		 
	        String input = "Hello, World!";
	        
	        StringBuilder reversed = new StringBuilder();
	        
	        
	        for (int i = input.length() - 1; i >= 0; i--) {
	        	
	            reversed.append(input.charAt(i));
	        }
	        
	        System.out.println("Reversed string: " + reversed.toString());
	    }

}
