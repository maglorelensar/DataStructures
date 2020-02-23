// Java program for deletion in AVL Tree 

package deletionavltree;

import java.util.Scanner;

class Main 
{ 
	
    
	public static void main(String[] args) 
	{ 
            Scanner scan =new Scanner(System.in);
          
		Tree tt = new Tree();
               
              for(int i=0 ;i<9;i++){
                  System.out.print("Ekle =");
                  int x=scan.nextInt();
                tt.root = tt.insert(tt.root, x); 
            }
             //Rakamlar 15,20,24,10,13,7,30,36,25

		
		System.out.println("Preorder çıktısı :"); 
							
		tt.preOrder(tt.root); 

		tt.root = tt.deleteNode(tt.root, 20); 

	
		System.out.println(""); 
		System.out.println("20 Değerini Siliyoruz ..."); 
		tt.preOrder(tt.root); 
                
                tt.root = tt.deleteNode(tt.root, 24); 

	
		System.out.println(""); 
		System.out.println("24 Değerini Siliyoruz ..."); 
		tt.preOrder(tt.root); 
                
          
                
	} 
} 


