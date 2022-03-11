package week3.day1;

import java.util.Arrays;

public class String_Anagram {
	
	/*
	 * Pseudo Code
	  
	 *Declare a String 
		String text1 = "stops";
	 *Declare another String
		String text2 = "potss"; 
	 * a) Check length of the strings are same then (Use A Condition)
	 * b) Convert both Strings in to characters
	 * c) Sort Both the arrays
	 * d) Check both the arrays has same value
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 = "stops";
		String text2 = "potss";
		char[] ch1;
		char[] ch2;
		
		
		int size1 = text1.length();
		int size2 = text2.length();
		
		if (size1 == size2) {
			
		ch1 = text1.toCharArray();
		ch2 = text2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		//if (Arrays.equals(ch1, ch2))
		
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
			
		}

	}
	
}


