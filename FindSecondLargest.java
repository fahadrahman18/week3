package week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {
	
	int[] data = {3,2,11,4,6,7};

	
	/*
	 Pseudo Code:
	 1) Arrange the array in ascending order
	 2) Pick the 2nd element from the last and print it
	 */


	public static void main(String[] args) {
		
		List<Integer> data1 = new ArrayList<Integer>();
		
		data1.add(3);
		data1.add(2);
		data1.add(11);
		data1.add(4);
		data1.add(6);
		data1.add(7);
		
		System.out.println("Actual order : " + data1);
		
		Collections.sort(data1);
		
		System.out.println("Ascending order : " + data1);
		
		int size1 = data1.size();
		System.out.println("size of an data1 is " + size1);
		
		System.out.println("2nd element from the last in data1 is " + data1.get(size1-2));
		
		
		

		
	}


}
