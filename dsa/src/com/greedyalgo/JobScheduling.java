package com.greedyalgo;

import java.util.ArrayList;
import java.util.Collections;

public class JobScheduling {
	
	char id;
	int profit, deadline;
	
	public JobScheduling(char id, int deadline, int profit) {
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	
	public static void printJobSequence(ArrayList<JobScheduling> arr, int maxdeadline) {
		int n  = arr.size();
		Collections.sort(arr, (a,b) -> b.profit - a.profit);
		
		boolean result[] = new boolean[maxdeadline];
		char job[] = new char[maxdeadline];
		
		for(int  i = 0; i<n; i++){
			for(int j = Math.min(maxdeadline - 1, arr.get(i).deadline -1); j>=0; j--) {
				if(result[j] == false) {
					result[j] = true;
					job[j] = arr.get(i).id;
					break;
				}
				
			}
					
		}
		for (char id :job)
		{
			System.out.print(id + " ");
		}
		System.out.println();
	
	}
	
	public static void main(String[] args) {
		ArrayList<JobScheduling> arr = new ArrayList<>();
		
		arr.add(new JobScheduling('1', 5 , 55));
		arr.add(new JobScheduling('2', 2 , 65));
		arr.add(new JobScheduling('3', 7 , 75));
		arr.add(new JobScheduling('4', 3 , 60));
		arr.add(new JobScheduling('5', 2 , 70));
		arr.add(new JobScheduling('6', 1 , 50));
		arr.add(new JobScheduling('7', 4 , 85));
		arr.add(new JobScheduling('8', 5 , 68));
		arr.add(new JobScheduling('9', 3 , 45));
		
		printJobSequence(arr, 7);

	}

}