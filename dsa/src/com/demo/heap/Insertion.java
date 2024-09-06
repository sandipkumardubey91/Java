package com.demo.heap;

public class Insertion {

	public static void swap(int arr[], int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
	public static void printArray(int arr[]) {
		for(int i : arr) {
			if(i>0)
				System.out.print(i+ " ");
		}
		System.out.println();
	}
	
	public static void heapify(int arr[], int n, int i) {
		int parent = (i - 1)/2;
		if(arr[parent] > 0) {
			if(arr[i] > arr[parent]) {
				swap(arr,i,parent);
				
				heapify(arr,n,parent);
			}
		}
	}
	
	public static int insert(int arr[], int n, int value) {
		n++;
		
		arr[n-1] = value;
		
		heapify(arr,n,n-1);
		
		return n;
	}
	
	public static void main(String[] args) {
		
		int MAX = 100;
		
		int arr[] = new int[MAX];
		
		arr[0] = 100;
		arr[1] = 90;
		arr[2] = 60;
		arr[3] = 40;
		arr[4] = 50;
		
		
		int n = 5;
		System.out.println("Before insertion");
		printArray(arr);
		
		n = insert(arr,n,80);
		
		System.out.println("After  insertion");
		printArray(arr);
		
		n = insert(arr,n,95);
		printArray(arr);
	}

}
