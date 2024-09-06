// ip - DD op 321 \\\ ip -II op -- 123 || output must be in b/w 1-9 repetition  is not allowed.

package com.demo.stack;
import java.util.Scanner;
import java.util.Stack; 

public class MinNumberFromAPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("I/P: ");
		String str = sc.nextLine();
		
		if(str.length() >8)
		{
			System.out.println("Input Size gt 8:(");
			return;
		}
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i<=str.length(); i++)
		{
			st.push(i+1);
			
			if( i == str.length() || str.charAt(i) == 'I' )
			{
				while(!st.isEmpty())
					System.out.print(st.pop());
			}
				
		}

	}

}
