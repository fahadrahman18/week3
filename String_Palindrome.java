package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_Palindrome {
	
	//Build a logic to find the given string is palindrome or not
    
	/*
	 * Pseudo Code
	
	 * a) Declare A String value as"madam"
	 
	 * b) Declare another String rev value as ""
	 * c) Iterate over the String in reverse order
	 * d) Add the char into rev
	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
	 
	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Madam";
		String rev = "";
		char ch;
		
		System.out.println("Original string is " + text);
		
		int size = text.length();
		
		for (int i = 0; i < size; i++) {
			
			ch = text.charAt(i);
			rev = ch + rev;
			
			
		}
		
		System.out.println("Reversed string is " + rev);
		
		
		if (text.equalsIgnoreCase(rev)) {
			System.out.println("Strings are palindrome");
		}
		else {
			System.out.println("Strings are not palindrome");
		}

	}

}
