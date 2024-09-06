package com.demo.DP;

public class FibonacciTopDown {

	public static int fibb(int n) {
		int a = 0, b = 1, c = -1;
		
		if(n == 0 || n == 1)
				return n;
		for(int  i = 2; i<=n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}
	public static void main(String[] args) {
		int n = 6;
		System.out.println(fibb(n));

	}

}
