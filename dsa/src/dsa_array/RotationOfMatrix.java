package dsa_array;

import java.util.*;
import java.util.Arrays;
import java.io.*;

public class RotationOfMatrix {

	public static void rotateMatrix(int arr[][])
	{
		//Transpose.
		int m = arr.length;
		int n = arr[0].length;
		
		for(int i = 0; i<m; i++)
		{
			for(int j = i; j<n; j++)
			{
				int temp = arr[i][j];
				
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		
		//Swapping b/w columns.
		
		for(int i = 0; i<m; i++)
		{
			int li = 0; //left column index.
			int ri = n-1; //right column index.
			
			while(li<ri)
			{
				int temp = arr[i][li];
				
				arr[i][li] = arr[i][ri];
				arr[i][ri] = temp;
				li++;
				ri--;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {
				{10,25,35,45},
				{21,31,41,51},
				{39,49,59,69},
				{40,50,60,70}
		};
		
		rotateMatrix(arr);
		
		for(var mat:arr)
		{
			System.out.println(Arrays.toString(mat));
			
		}
		
//		for(int i = 0; i<arr.length; i++)
//		{
//			for(int j = 0; j<arr[0].length; j++)
//			{
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}


























// time complexity: O(m * n)
// space complexity: O(1)
//import java.util.*;
//import java.io.*;
//
//class RotationOfMatrix {
//    
//    public static void rotatedMatrix(int[][] arr){
//        // Step 1: Transpose the 2D array
//        int m = arr.length;
//        int n = arr[0].length;
//
//        for(int i=0; i<m; i++){
//            for(int j=i; j<n; j++){
//                int temp = arr[i][j];
//                arr[i][j] = arr[j][i];
//                arr[j][i] = temp;
//            }
//        }
//
//        // Step 2: Swap the left and right side elements
//        for(int i=0; i<m; i++){
//            int li = 0;
//            int ri = n-1;
//
//            while(li < ri){
//                int temp = arr[i][li];
//                arr[i][li] = arr[i][ri];
//                arr[i][ri] = temp;
//
//            li++;
//            ri--;
//            }
//        }
//    }
//    
//    
//    
//    public static void main(String[] args) {
//        int[][] arr = {
//            {1, 2, 3, 4},
//            {5, 6, 7, 8},
//            {9, 10, 11, 12},
//            {13, 14, 15, 16}
//        };
//
//        // function calling
//        rotatedMatrix(arr);
//
//        for(var mat:arr){
//            System.out.println(Arrays.toString(mat));
//        }
//    }
//}
