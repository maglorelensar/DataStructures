
package merge;

import com.sun.javafx.font.CharToGlyphMapper;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Merge {
	
	static void diziyiYazdir(int[] array) 
	{ 
		int n = array.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(array[i] + " "); 
		System.out.println(); 
	} 

	
	public static void main(String args[]) 
	{  Scanner sc = new Scanner(System.in);
           String adsoyad;
           System.out.print("Bir karakter dizisi giriniz :");
            adsoyad = sc.nextLine();                    
                int[] dizi;   
        dizi=new int[adsoyad.length()];
        for(int i =0;i<dizi.length;i++){
            dizi[i]=adsoyad.charAt(i);
        
    }
		//int arr[] = {12, 11, 13, 5, 6, 7}; 

		System.out.println("Dizi ilk hali"); 
		diziyiYazdir(dizi); 

		MergeSort ob = new MergeSort(); 
		ob.sort(dizi, 0, dizi.length-1); 

		System.out.println("\nDizinin Sıralanmış Hali"); 
		diziyiYazdir(dizi); 
	} 
} 


    

