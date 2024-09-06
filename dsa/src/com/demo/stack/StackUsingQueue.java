package com.demo.stack;

import java.util.LinkedList;
import java.util.Queue;
public class StackUsingQueue {
	
	static Queue<Integer>  q1 = new LinkedList<>();
	static Queue<Integer>  q2 = new LinkedList<>();
	
	static void addData(int data)
	{
		while(!q1.isEmpty())
		{
			q2.add(q1.peek());
			q1.poll();
		}
		q1.add(data);
		
		while(!q2.isEmpty())
		{
			q1.add(q2.peek());
			q2.poll();
			
		}
	}
	
	static int deleteData()
	{
		if(q1.isEmpty())
		{
			System.out.println("Stack Is Empty:(");
			System.exit(0);
		}
		int ele = q1.peek();
		q1.poll();
		return ele;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deleteData());
		System.out.println("--------");
		addData(10);
		addData(20);
		addData(30);
		addData(40);
		addData(50);
		
		System.out.println(deleteData());
		System.out.println("--------");
		
	}

}
