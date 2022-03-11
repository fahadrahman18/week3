package week3.day1;

public class String_FindTypes {
	
	// Here is the input
			//String test = "$$ Welcome to 2nd Class of Automation $$ ";

			// Here is what the count you need to find
//			int  letter = 0, space = 0, num = 0, specialChar = 0;

			// Build the logic to find the count of each
			/* Pseudo Code:
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
			*/

			// Print the count here
			//System.out.println("letter: " + letter);
			//System.out.println("space: " + space);
			//System.out.println("number: " + num);
			//System.out.println("specialCharcter: " + specialChar);

	

	public static void main(String[] args) {
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
			
	    char temp[] = test.toCharArray();  //convert string into character array
	    
	    for (int i = 0; i < temp.length; i++) {          //char_array - .length  //string - .length()
	    	
	    	char ch = temp[i];
	    	
	    	if (Character.isLetter(ch)) {
	    		
	    	letter += 1;	
	    	}
	    	
	    	else if (Character.isDigit(ch)) {
	    		
	    		num += 1;
	    	}
	    	
	    	else if (Character.isSpaceChar(ch)) {
	    		
	    		space += 1;
	    	}
	    	else {
	    		specialChar++;
	    	}
	    	
		
		}
		
	    System.out.println("no. of letter: " + letter);
		System.out.println("no. of space: " + space);
		System.out.println("no. of number: " + num);
		System.out.println("no. of specialCharcter: " + specialChar);
    	

	}

}
