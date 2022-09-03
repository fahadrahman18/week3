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
		String text1 = "stops";
		String text2 = "potss";
		char[] charArray1 = null;
		char[] charArray2 = null;
		
		int len1 = text1.length();
		int len2 = text2.length();
		
		if (len1 == len2) {
			charArray1 = text1.toCharArray();
			charArray2 = text2.toCharArray();		
		
		
		System.out.println(charArray1);
		System.out.println(charArray2);
		
		//sort compares string as based on ASCII value, so s & S - both are different value as per Arrays sort
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		System.out.println(charArray1);
		System.out.println(charArray2);
		if (Arrays.equals(charArray1, charArray2)) {
			System.out.println("Strings are Anagram");
		}
		else {
			System.out.println("Strings are not a Anagram");
		}
		}
		else {
			System.out.println("Strings are not a Anagram");
		}
		}
	}


