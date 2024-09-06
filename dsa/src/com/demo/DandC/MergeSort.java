package com.demo.DandC;

import java.util.Scanner;

public class MergeSort {

	public static void printArray(int arr[], int n)
	{
		for(int i:arr)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void mergeSort(int arr[], int left, int right)
	{
		if(left < right)
		{
			int mid = left + (right - left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	
	public static void merge(int arr[],int l, int mid, int r)
	{
		int i,j,k;
		
		int n1 = mid - l + 1;
		int n2  = r - mid;
		
		int lsubarray[] = new int[n1];
		int rsubarray[] = new int [n2];
		
		for (i = 0; i<n1; i++)
			lsubarray[i] = arr[l + i];
		for (j = 0; j<n2; j++)
			rsubarray[j] = arr[mid + 1 +j];
		
		i = 0;
		j = 0;
		k = l;
		while(i<n1 && j <n2)
		{
			if(lsubarray[i] <= rsubarray[j])
				arr[k++] = lsubarray[i++];
			else
				arr[k++] = rsubarray[j++];
					
		}
		while(i<n1)
			arr[k++] = lsubarray[i++];
		while(j<n2)
			arr[k++] = rsubarray[j++];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the size of Array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("\nEnter the elements of Array: ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		//printArray(arr,n);
		mergeSort(arr,0,n-1);
		printArray(arr,n);
	}

}
