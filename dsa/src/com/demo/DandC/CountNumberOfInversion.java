package com.demo.DandC;

import java.util.Arrays;

public class CountNumberOfInversion {
	public static int numberOfInversionBrute(int arr[])
	{
		int count  = 0;
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = i+1; j<arr.length; j++)
			{
				if(arr[i]>arr[j])
				count++;
			}
		}
		return count;
	}
	
	public static int mergeC(int arr[], int low, int mid ,int high)
	{
		int lsubarr[] = Arrays.copyOfRange(arr, low, mid+1);
		int rsubarr[] = Arrays.copyOfRange(arr, mid, high+1);
		
		int i = 0, j = 0, k =low;
		int swap = 0;
		while(i<lsubarr.length && j<rsubarr.length)
		{
			if(lsubarr[i] <= rsubarr[j])
			{
				arr[k++] = lsubarr[i++];
			}
			else
			{
				arr[k++] = rsubarr[j++];
				swap += (mid +1 ) - (low + i);
			}
		}
		while(i<lsubarr.length)
			arr[k++] = lsubarr[i++];
		while(j<rsubarr.length)
			arr[k++] = rsubarr[j++];
		
		return swap;
	}
	
	public static int numberOfInversionDC(int arr[], int low, int high)
	{
		int count = 0;
		if(low < high)
		{
			int mid = low + (high - low)/2;
			count += numberOfInversionDC(arr, low, mid);
			count += numberOfInversionDC(arr, mid+1, high);
			count += mergeC(arr, low, mid, high);
			
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,2,8,3,4};
		System.out.println(numberOfInversionBrute(arr));
		System.out.println(numberOfInversionDC(arr, 0, arr.length - 1));
		

	}

}
