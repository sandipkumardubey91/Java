package dsa_array;

public class Reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 20 ,30, 40, 50, 60, 70, 80, 90};
		int n = arr.length;
		
		for(int i = 0; i<n/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = arr[i];
		}
		System.out.println("Revesed array is as follow: ");
		
		for(int i = 0; i<n; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
