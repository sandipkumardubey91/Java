package com.demo.stack;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {
	public static boolean isValidParen(String str) {
		char ch[] = str.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		
		for(char ele : ch)
		{
			if(ele =='(' || ele == '{' || ele == '[')
			{
				stack.push(ele);
				continue;
			}
			else if(stack.isEmpty())
				return false;
			char top = stack.pop();
			if(top == '(' && ele !=')')
				return false;
			else if(top == '{' && ele !='}')
				return false;
			if(top == '[' && ele !=']')
				return false;
		}
		 return stack.isEmpty()==true;
	
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter an String of any Combination of '(' ')' '{' '}' '[' ']': ");
		String str = sc.nextLine();
		System.out.println("The entered stirng is valid ?: " + isValidParen(str));
	}

}
