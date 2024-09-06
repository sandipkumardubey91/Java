package com.demo.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class CheckCycle {
private int V;
	
	private LinkedList<Integer> adj[];
	public CheckCycle(){}
	
	public CheckCycle(int v) {
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i<v; ++i) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v, int u) {
		adj[v].add(u);
		adj[u].add(v);
		
	}
	
	public boolean isCyclicUtil(int v, boolean visited[], int parent) {
		
		visited[v] = true;
		
		Integer i;
		
		Iterator<Integer> itr = adj[v].iterator();
		
		while(itr.hasNext()) {
			
			i = itr.next();
			
			if(!visited[v]) {
				
				if(isCyclicUtil(i, visited, v)) {
					
					return true;
				}
			}
			else if(i != parent) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isCyclic(int v) {
		boolean visited[] = new boolean[v];
		
		for(int i = 0; i<v; i++) {
			
			visited[v] = false;
		}
		
		for(int i = 0; i<v; i++) {
			if(!visited[i]) {
				
				if(isCyclicUtil(i, visited, -1)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
//		int v1 = 5;
//		
//		CheckCycle graph1 = new CheckCycle(v1);
//		
//		graph1.addEdge(1, 0);
//		graph1.addEdge(0, 2);
//		graph1.addEdge(2, 1);
//		graph1.addEdge(0, 3);
//		graph1.addEdge(3, 4);
//		
//		if(graph1.isCyclic(v1)) {
//			System.out.println("Contains Cycle");
//		}
//		else {
//			System.out.println("Better luck next time");
//		}
//		
		
		int v2 = 3;
		CheckCycle graph2 = new CheckCycle(v2);
		
		graph2.addEdge(0, 1);
		graph2.addEdge(1, 2);
		
		//graph2.addEdge(0, 2);
		//graph2.addEdge(2, 3);
		
		
		if(graph2.isCyclic(v2)) {
			System.out.println("Contains Cycle");
		}
		else {
			System.out.println("Better luck next time");
		}
	}

}
