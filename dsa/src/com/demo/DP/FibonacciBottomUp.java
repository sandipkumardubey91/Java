package com.demo.DP;

import java.util.Arrays;

public class FibonacciBottomUp {

	public static int fibHelper(int n, int fibseries[]) {
		if(n == 0 || n == 1)
			return n;
		
		if(fibseries[n] != -1)
			return fibseries[n];
		
		int x = fibHelper(n - 1 , fibseries);
		int y = fibHelper(n - 2, fibseries);
		
		fibseries[n] = x + y;
		
		return fibseries[n];
	}
	
	public static int fibb(int n) {
		int fibSeries[] = new int[n+1];
		Arrays.fill(fibSeries, -1);
		
		return fibHelper(n, fibSeries);
	}
	public static void main(String[] args) {
		int n = 5;
		System.out.println(fibb(n));

	}

}
