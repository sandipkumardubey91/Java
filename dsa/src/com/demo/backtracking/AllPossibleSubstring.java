package com.demo.backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPossibleSubstring {

	public static void printpsubstring(int arr[], int index, ArrayList<Integer> tempArray)
	{
		if(index == arr.length)
		{
			if(tempArray.size() > 0)
				System.out.println(tempArray);
			return;
		}
		
		printpsubstring(arr,index + 1, tempArray);
			tempArray.add(arr[index]);
		printpsubstring(arr, index + 1, tempArray);
			tempArray.remove(tempArray.size() - 1);
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,2,3};
		
		System.out.println("For Array: " + Arrays.toString(arr));
		
		printpsubstring(arr,0,new ArrayList<>());
		
		
		
	}
	
}
				
