package dsa_array;

public class missing_number_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,8,9,10};
		int n = arr.length;
		
		int sum_of_natural_no = (((n+1)*(n+2)))/2;
		
		int arr_sum = 0;
		
		for(int i = 0; i<n; i++)
		{
			arr_sum += arr[i];
		}
		
		int missing_no = sum_of_natural_no - arr_sum;
		
		System.out.println("The maiising number of the given array is: " + missing_no);
	}

}
