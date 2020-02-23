/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts_29_10_19;

/**
 *
 * @author LENOVO
 */
public class Sorts_29_10_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KarmaSrts srt = new KarmaSrts();
        int dizi[] = new int[]{10, 15, 1, 2, 9, 16, 11,24,88};
        System.out.println("Sıralama Öncesi dizi : ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
        //srt.BubbleSort(dizi);
        //srt.InsertionSort(dizi);
        //srt.SelectionSort(dizi);
        srt.quıckSort(dizi, 0, 6);
       // srt.shellSort(dizi);
        //srt.countingSort(dizi);
        //srt.radixSort(dizi);
       //srt.sort(dizi, 0, 8); 
      //KarmaSrts.radixSortt(dizi, dizi.length);
        System.out.println("");
        System.out.println("Sıralama Sonrası dizi : ");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }
    
//    int dizi[]=new int[]{9,0,1,9,1,2,3,0};
//     int count[]=new int[]{0,0,0,0,0,0,0,0,0,0};
} 
