package recurssion;
import java.util.*;

import java.io.*;
import java.math.*;


public class Power {
	
	public static BigInteger powr(BigInteger a, int b)
	
	{
//		if (b== 0)
//			return 1;
		
		if(b==1)
			return a;
		
		BigInteger ans = powr(a,b/2);
		BigInteger fans = ans.multiply(ans);
		if(b%2 == 0)
			return fans;
		else
			return a.multiply(fans);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the value of base: ");
		BigInteger base = sc.nextBigInteger();
		System.out.print("\nEnter the value of power: ");
		int power = sc.nextInt();
		
		BigInteger result = powr(base,power);
		
		System.out.print("\n" + base + " raised to " +power +" is: " + result);
		
	}

}
