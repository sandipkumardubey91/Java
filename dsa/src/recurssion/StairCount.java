package recurssion;
import java.util.*;
import java.io.*;


public class StairCount {
	
	private static int staircase(int n)
	{
		if (n==0)
			return -1;
		
		if (n == 1 || n== 2 || n==3 )
			return n;
		
		return staircase(n-1) + staircase(n-2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the number of stairs:" );
		
		int stairs = sc.nextInt();
		
		int possibleways = staircase(stairs);
		
		System.out.print("\nThe number of possible ways are: " + possibleways);
	}

}
