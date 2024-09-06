package dsa_array;
import java.util.*;

public class LowerBound {
	public static int lowerBound(int arr[], int key)
	{
		int low = 0;
		int high = arr.length - 1;
		int result = -1;
		
		while(low <= high)
		{
			int mid = low + (high - low)/2;
			
			if(arr[mid] == key)
			{
				result = mid;
				high = mid - 1;
			}
			else if(arr[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n;
		int key;
		
		System.out.print("\nEnter the number of element in the aaray: ");
		n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("\nEnter elements of the array: ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("\nEnter the key element: ");
		key = sc.nextInt();
		
		int result = lowerBound(arr,key);
		
		if(result == -1)
		{
			System.out.println("\nNot Found");
		}
		else
		{
			System.out.println("\nFound at: "+ result);
		}
	}

}
