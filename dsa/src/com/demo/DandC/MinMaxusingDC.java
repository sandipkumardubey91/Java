package com.demo.DandC;

public class MinMaxusingDC {
	static class Pair{
		int min;
		int max;
	}
	
	public static Pair getMinMax(int arr[], int low, int high)
	{
		Pair minmax = new Pair();
		Pair minmaxl = new Pair();
		Pair minmaxr = new Pair();
		
		if(low == high)
		{
			minmax.min = arr[low];
			minmax.max= arr[high];
		}
		else if(low == high - 1)
		{
			if(arr[low] < arr[high])
			{
				minmax.min = arr[low];
				minmax.max = arr[high];
			}
			else
			{
				minmax.min = arr[high];
				minmax.max = arr[low];
			}
		}
		else
		{
			int mid = low + (high - low)/2;
			
			minmaxl = getMinMax(arr, low, mid);
			minmaxr = getMinMax(arr,mid+1, high);
			
			
			if(minmaxl.min < minmaxr.min)
			{
				minmax.min = minmaxl.min;
			}
			else
				minmax.min = minmaxr.min;
			if(minmaxl.max>minmaxr.max)
				minmax.max = minmaxl.max;
			else
				minmax.max = minmaxr.max;
			
		}
		return minmax;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,5,30,20,40,90,60,50,1};
		
		Pair minmax = getMinMax(arr,0,arr.length - 1);
		
		System.out.println("min: " + minmax.min +" max: " + minmax.max);

	}

}
