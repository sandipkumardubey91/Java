package dsa_array;

public class findAllDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,4,5,6,7,7,8,9};
		
		int n = arr.length;
		int flag = 0;
		for(int i = 0; i<n; i++)
		{
			for(int j = i+1; j<n; j++)
			{
				if (arr[i] == arr[j])
				{
					System.out.println("Duplicate element is: " + arr[i]);
					flag = 1;
				}
			}
		}
		
		if(flag == 0)
			System.out.println("No Duplicates Elements  are found.");

	}

}
