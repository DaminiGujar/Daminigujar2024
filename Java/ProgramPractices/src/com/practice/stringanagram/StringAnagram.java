package com.practice.stringanagram;


//Write a Java program to check if a given string is an anagram or not.
public class StringAnagram {
	
	
	public static void main(String[] args) {
		
		
	
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;
        
        
        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            int[] count = new int[26];
            
            for (int i = 0; i < str1.length(); i++) {
                count[str1.charAt(i) - 'a']++;
                count[str2.charAt(i) - 'a']--;
            }
            
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
}
}
