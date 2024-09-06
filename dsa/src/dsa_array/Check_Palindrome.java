package dsa_array;
import java.util.Scanner;



public class Check_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[] = {1,2,3,4,4,3,2,1};
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter number of element in the array: ");
		int n = sc.nextInt();
		System.out.println("Enter  elements in the array: ");
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		int flag  = 0;
		
		for(int i = 0; i< n/2; i++)
		{
			if(arr[i] != arr[n-i-1])
			{
				flag = 1;
				System.out.println("Array is not Palindromic.");
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Array is  Palindromic.");

	}

}
