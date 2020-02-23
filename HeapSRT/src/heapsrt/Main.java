
package heapsrt;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
	{ 
		int arr[] = {12, 11, 13, 5, 6, 7}; 
                int arr2[] = {12, 11, 13, 5, 6, 7};     
		int n = arr.length; 
  int arr3[] = {10, 16, 3, 27, 39, 41, 4};
		HeapSort hp = new HeapSort(); 
                System.out.println("Dizinin ilk hali : ");
                hp.printArray(arr);
		hp.sort(arr); 
                
		System.out.println("Min Heap'e Göre Sıralanmış Hali"); 
		hp.printArray(arr); 
                System.out.println("Max Heap'e Göre Sıralanmış Hali");
                hp.sort2(arr3);
                hp.printArray(arr3);
	} 
} 
    

