
package bfs;


public class BFS {

   
  public static void main(String args[]) 
    { 
        Graph g = new Graph(15); 
    //Değerlerin Yerleştirilmesi
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(1, 4);       
        g.addEdge(2, 4); 
        g.addEdge(2, 5); 
        g.addEdge(2, 6);
        g.addEdge(3, 7); 
        g.addEdge(3, 8); 
        g.addEdge(6, 9); 
        g.addEdge(8, 9);
        System.out.println("-------------Breadth First Search-------------");
        //Çift Yönlü Olabilmesi İçin Simetrik Değerlerin Girilmesi
        g.addEdge(1,0); 
        g.addEdge(2, 0); 
        g.addEdge(3, 0); 
        g.addEdge(4, 1);       
        g.addEdge(4, 2); 
        g.addEdge(5, 2); 
        g.addEdge(6, 2);
        g.addEdge(7, 3); 
        g.addEdge(8, 3); 
        g.addEdge(9, 6); 
        g.addEdge(9, 8);
  
        System.out.print("*0* dan başlayarak gezme = ");
  
        g.BFS(0); 
        System.out.println("");
        System.out.print("*1* den başlayarak gezme = ");
        g.BFS(1);
        System.out.println("");
           System.out.print("*2* den başlayarak gezme = ");
  
        g.BFS(2); 
        System.out.println("");
        System.out.print("*3* ten başlayarak gezme = ");
        g.BFS(3);
        System.out.println("");
           System.out.print("*4* ten başlayarak gezme = ");
  
        g.BFS(4); 
        System.out.println("");
        System.out.print("*5* ten başlayarak gezme = ");
        g.BFS(5);
        System.out.println("");
           System.out.print("*6* dan başlayarak gezme = ");
  
        g.BFS(6); 
        System.out.println("");
        System.out.print("*7* den başlayarak gezme = ");
        g.BFS(7);   
        System.out.println("");
        System.out.print("*8* den başlayarak gezme = ");
  
        g.BFS(8); 
        System.out.println("");
        System.out.print("*9* dan başlayarak gezme = ");
        g.BFS(9);
    } 
} 
