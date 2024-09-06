package com.greedyalgo;

import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;

public class fractionalKnapSack {
	public static double getMaxVal(ItemValue arr[],int capacity) throws Exception
	{
		Arrays.sort(arr, new Comparator<ItemValue>(){
			@Override
			public int compare(ItemValue item1, ItemValue item2) {
				double cpr1 = Double.valueOf(item1.profit/ item1.weight);
				double cpr2 = Double.valueOf(item2.profit/ item2.weight);
				
				if(cpr1 < cpr2)
					return 1;
				else
					return -1;
			}
		});
		
		double totalvalue = 0;
		
		for (ItemValue i:arr) {
			int currwei = i.weight;
			int currpro = i.profit;
			if (capacity - currwei >= 0) {
				totalvalue += currpro;
				capacity -= currwei;
				}
			else {
				double fraction = capacity / currwei;
				totalvalue += currpro * fraction;
				capacity -= currwei * fraction;
				break;
			}
		}
		
		return totalvalue;
		
		
	}
	
	static class ItemValue{
		private int profit;
		private int weight;
		
		public ItemValue(int profit, int wieght){
			this.profit = profit;
			this.weight = weight;
			
		}


	}
	
	public static void main(String[] args) throws Exception {
		
		ItemValue arr[] = { new ItemValue(25, 5),
							new ItemValue(75, 10),
							new ItemValue(100, 12),
							new ItemValue(50, 4),
							new ItemValue(45, 7),
							new ItemValue(90, 9),
							new ItemValue(30, 3)
		};
		
		int capacity = 37;
		
		System.out.println( getMaxVal(arr, capacity));
	}

}
