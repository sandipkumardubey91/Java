package recurssion;

import java.util.*;

public class AlternateSignSeries {

	public static int alter(int n)
	{
		if (n==1)
			return 1;
		
		if (n%2==0)
			return alter(n-1) - n;
		else
			return alter(n-1) + n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter n: ");
		int n = sc.nextInt();
		
		System.out.println(alter(n));
	}

}
