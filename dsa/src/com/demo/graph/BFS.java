package com.demo.graph;

import java.util.*;
public class BFS {
	private int V;
	
	private LinkedList<Integer> adj[];
	public BFS(){}
	
	public BFS(int v) {
		V = v;
		adj = new LinkedList[v];
		
		for(int i = 0; i<v; ++i) {
			adj[i] = new LinkedList<>();
		}
	}
	
	public void addEdge(int v, int u) {
		adj[v].add(u);
		
	}
	
	public void bfsTraversal(int s) {
		
		boolean visited[] = new boolean[V];
		
		LinkedList<Integer> queue = new LinkedList<>();
		
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> itr = adj[s].listIterator();
			
			while(itr.hasNext()) {
				int n = itr.next();
				
				if(!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int v = 4;
		
		BFS bfs = new BFS(v);
		
		bfs.addEdge(0, 1);
		bfs.addEdge(1, 0);
		bfs.addEdge(0, 2);
		bfs.addEdge(2, 0);
		bfs.addEdge(1, 3);
		bfs.addEdge(3, 1);
//		dfs.addEdge(2, 0);
//		dfs.addEdge(3, 3);
//		dfs.addEdge(2, 3);
		
		System.out.println("BFS from vertex: 0");
		bfs.bfsTraversal(0 );
		System.out.println();
		System.out.println("BFS from vertex: 1");
		bfs.bfsTraversal(1 );
		System.out.println();
		System.out.println("BFS from vertex: 2");
		bfs.bfsTraversal(2 );
		System.out.println();
		System.out.println("BFS from vertex: 3");
		bfs.bfsTraversal(3);
		System.out.println();
	}

}

