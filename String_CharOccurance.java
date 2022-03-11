package week3.day1;

import java.util.Arrays;

public class String_CharOccurance {
	
	// Check number of occurrences of a char (eg 'e') in a String
	
	//String str = "welcome to chennai";

	// declare and initialize a variable count to store the number of occurrences
	
	// convert the string into char array
		
	//get the length of the array
		
	// traverse from 0 till the array length 
		
		// Check the char array has the particular char in it 
	
		// if is has increment the count
			 
		
		// print the count out of the loop

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "welcome to chennai";
		int count = 0;
		char ch;
		
		int size = str.length();
		
		for (int i = 0; i < size; i++) {
			
			char temp = str.charAt(i);
			ch = 'e';
			if (temp == ch) {
				
				count += 1;
				
			}
			
			
			
		}
		
	System.out.println("Number of 'e' character present in the string " + count + " times");
		

	}

}
