package com.demo.DandC;

public class SelectionProcedure {

	public static int partitionDC(int arr[], int low, int high)
	{
		int pivot = arr[low];
		int i = low;
		for(int j = low + 1; j<=high; j++)
		{
			
			if(arr[j] <= pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[i];
		arr[i] = temp;
		
		return i;
	}
	
	public static int SelectionProcedureDC(int arr[], int low, int high, int k)
	{
		//if(low < high)
		{
			int m = partitionDC(arr,low,high);
			if(m == k-1)
				return arr[m];
			else if(m<k-1)
			{
				return SelectionProcedureDC(arr,m+1,high, k);
				
			}
			else
				return SelectionProcedureDC(arr,low,m-1,k);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {90,80,70,60,50,40,30,20,10};
		int k = 5;
		System.out.println(SelectionProcedureDC(arr,0,arr.length-1,k));
	}

}
