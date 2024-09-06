package com.demo.backtracking;

import java.util.Arrays;

public class NQueens {
	public static void printSolution(int mat[][], int n)
	{
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				System.out.print(mat[i][j] + " " + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	
	public static boolean isSafe(int board[][], int row, int column, int n)
	{
		int i = 0, j = 0;
		
		
		// check on the left row
		for(i = 0; i<column; i++)
		{
			if(board[row][i] == 1 )
				return false;
		}
		
		//check for upper diagonal in the lest direction
		
		for(i = row, j = column; i>=0 && j>=0; i--, j--)
		{
			if(board[i][j] == 1)
				return false;
		}
		
		//check for lower diagonal in the left direction
		
		for(i = row, j = column; i<n && j>=0 ; i++, j--)
		{
			if(board[i][j] == 1)
				return false;
		}
		return true;
	}
	
	public static boolean solveNQueens(int board[][], int column, int n)
	{
		// base case :-- if all columns are filled with queens
		if(column>=n)
		{
			return true;
		}
		
		for(int i = 0; i<n; i++)
		{
			if(isSafe(board, i , column, n) == true)
			{
				board[i][column] = 1;
			
			
			if(solveNQueens(board, column + 1, n)== true)
			{
				return true;
			}
			
			board[i][column] = 0;
			
			
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int board[][] = {
//						{0,0,0,0},
//						{0,0,0,0},
//						{0,0,0,0},
//						{0,0,0,0}};
		int board[][] = new int[8][8];
		for(int []row: board)
		{
			Arrays.fill(row, 0);
		}
		
		if(solveNQueens(board, 0, board.length) == true)
		{
			printSolution(board, board.length);
		}

	}

}
