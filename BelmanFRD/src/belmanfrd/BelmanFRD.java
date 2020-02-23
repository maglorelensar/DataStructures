
package belmanfrd;


class BelmanFRD 
{ 

public static void main(String[] args) 
{ 
    GFG gfg=new GFG();
	int V = 5; // Köşe Sayısı
	int E = 14; // Kenar Sayısı

	int graph[][] = { { 0, 1, 2 },{ 1, 0, 2 }, { 0, 3, 6 },{ 3, 0, 6 }, 
					{ 1, 2, 7 },{ 2, 1, 7 }, { 1, 4, 3 }, { 4, 1, 3 },
					{ 2, 3, 4 }, { 3, 2, 4 },{ 2, 4, 5 }, { 4, 2, 5 },
					{ 3, 4, 1 },{ 4, 3, 1 }  }; 
//A=0,B=1,C=2,D=3,E=4
	//gfg.BellmanFord(graph, V, E, 0); 
      gfg.BellmanFord(graph, V, E, 1); 
//       gfg.BellmanFord(graph, V, E, 2); 
//       gfg.BellmanFord(graph, V, E, 3); 
//       gfg.BellmanFord(graph, V, E, 4); 
//         
	} 
} 


