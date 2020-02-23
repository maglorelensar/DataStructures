/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belmanfrd;

/**
 *
 * @author LENOVO
 */
public class GFG {
    static void BellmanFord(int graph[][], int V, int E, 
				int src) 
{ 
	// Initialize distance of all vertices as 0. 
	int []dis = new int[V]; 
	for (int i = 0; i < V; i++) 
		dis[i] = Integer.MAX_VALUE; 

	// initialize distance of source as 0 
	dis[src] = 0; 

	// Relax all edges |V| - 1 times. A simple 
	// shortest path from src to any other 
	// vertex can have at-most |V| - 1 edges 
	for (int i = 0; i < V - 1; i++) 
	{ 

		for (int j = 0; j < E; j++) 
		{ 
			if (dis[graph[j][0]] + graph[j][2] < 
							dis[graph[j][1]]) 
				dis[graph[j][1]] = 
				dis[graph[j][0]] + graph[j][2]; 
		} 
	} 

	for (int i = 0; i < E; i++) 
	{ 
		int x = graph[i][0]; 
		int y = graph[i][1]; 
		int weight = graph[i][2]; 
		if (dis[x] != Integer.MAX_VALUE && 
				dis[x] + weight < dis[y]) 
			System.out.println("Graph contains negative"
					+" weight cycle"); 
	} 

	System.out.println("Yuvarlakların Değerleri = A=0,B=1,C=2,D=3,E=4"); 
	for (int i = 0; i < V; i++) 
		System.out.println("Yuvarlağın Değeri = "+i + " En kısa yol >>>>>>>  " + dis[i]); 
} 
}
