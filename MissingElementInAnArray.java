package week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {
	
	// Here is the input
	//int[] arr = {1,2,3,4,7,6,8};

	// Sort the array	
	

	// loop through the array (start i from arr[0] till the length of the array)

		// check if the iterator variable is not equal to the array values respectively
		
			// print the number
			
			// once printed break the iteration

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(7);
		arr1.add(6);
		arr1.add(8);
		
		Collections.sort(arr1);
		
		int size1 = arr1.size();
		
		for (int i = arr1.get(0); i <= size1; i++) {
			
			if (i != arr1.get(i-1)) {
				
				System.out.println(i);
				break;
				
				
				
				
			}
			
		}
		
		
		
		
		
		

	}

}
