package com.demo.stack;
import java.util.Stack;


public class QueueUsingStack {
	static Stack <Integer> stack1 = new Stack<>();
	static Stack <Integer> stack2 = new Stack<>();
	
	static void enQueue(int data)
	{
		stack1.push(data);
	}
	static int deQueue()
	{
		int x = 0;
		if(stack1.empty())
			System.out.println("No data :(");
		while(!stack1.empty())
		{
			x = stack1.pop();
			stack2.push(x);
		}
		
		x = stack2.pop();
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QueueUsingStack q = new QueueUsingStack();
		enQueue(10);
		enQueue(20);
		enQueue(30);
		enQueue(40);
		enQueue(50);
		
		System.out.println(deQueue());

	}

}
