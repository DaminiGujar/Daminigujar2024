package com.practice.stringpalindrome;

//Write a Java program to check if a string is a palindrome or not.
public class StringPalindrome {
	
	 public static void main(String[] args) {
		 
	        String input = "madam";
	        boolean isPalindrome = true;
	        
	        
	        for (int i = 0; i < input.length() / 2; i++) {
	            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }
	        
	        if (isPalindrome) {
	            System.out.println(input + " is a palindrome.");
	        } else {
	            System.out.println(input + " is not a palindrome.");
	        }
	    }

}
