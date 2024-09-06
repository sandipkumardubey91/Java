package dsa_array;
import java.util.*;

public class SquareRoot {

	public static int squareRoot(int num)
	{
		int low = 0;
		int high = num;
		int result = -1;
		while(low <= high)
		{
			
			int mid = low + (high - low)/2;
			int val = mid*mid;
			
			if(val == num)
				return mid;
			
			else if(val < num)
			{
				result = mid;
				low = mid +1;
			}
			else
				high = mid - 1;
			
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the Positive Integer Number: ");
		int num = sc.nextInt();
		
		int result = squareRoot(num);
		
		System.out.println("The Square Root of " + num +" is: " + result);
		
		
	}

}
