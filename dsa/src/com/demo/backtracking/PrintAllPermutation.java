package com.demo.backtracking;


public class PrintAllPermutation {

	public static String swapp(String str, int i, int j)
	{
		char ch[] = str.toCharArray();
		
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		
		return String.valueOf(ch);	}
	
	public static void permutation(String str, int l, int r)
	{
		if(l == r)
			System.out.println(str);
		else
		{
		for(int i = l; i <=r; i++)
		{
			str = swapp(str, l, i);
			
			permutation(str, l+1, r);
			
			str = swapp(str, l , i);
			
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "ABC";
		
		int n = str.length();
		
		permutation(str, 0, n - 1);
	}

}
