/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorts_29_10_19;

import com.sun.org.apache.bcel.internal.generic.SWAP;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.list;

/**
 *
 * @author LENOVO
 */
public class KarmaSrts {

    public void BubbleSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }
    }

    public void InsertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int tmp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > tmp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = tmp;
        }
    }

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void SelectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }

            }
            if (min != i) {
                swap(a, i, min);
            }
      }

    }

    public void quıckSort(int a[], int lb, int ub) {
        if (lb < ub) {
            int loc = partition(a, lb, ub);
            
            quıckSort(a, lb, loc - 1);
            
            quıckSort(a, loc + 1, ub);
        }
    }

    public int partition2(int a[], int l, int r) {//Static ???
        int pivot = r;
        int i = l;
        int j = r - 1;
        while (i < j) {
            while (a[i] < a[pivot]) {
                i++;
            }
            while (a[j] > a[pivot]) {
                j--;
            }
            if (i < j) {
                swap(a, i, j);
            }
        }
        swap(a, i, pivot);
        return i;

    }

    public int partition(int a[], int lb, int ub) {//Static ???
        int Pivot = lb;
        int start = lb;
        int end = ub;
        while (start < end) {
            while (a[start] < a[Pivot]) {
                start++;
            }
            while (a[end] > a[Pivot]) {
                end--;
            }
    
            swap(a, start, end);

        }
        swap(a, start, Pivot);
        return start;

    }
    
    public void shellSort(int a[]) {
        
        for (int g = a.length / 2; g > 0; g /= 2) {
            for (int i = a.length - 1; i >= g; i--) {
                for (int j = i; j >= g; j -= g) {
                    if (a[j] < a[j - g]) {
                        swap(a, j, j - g);
                    }
                }
            }
        }
    }

    public void countingSort(int a[]) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int count[] = new int[max+1];
        for (int i =0; i < max+1; i++) {
            count[i] = 0;
        }
        int tmp[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            count[a[i]]++;
        }
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        for (int i = a.length -1; i >=0; i--) {
            tmp[--count[a[i]]] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = tmp[i];
        }
    }public void radixSort(int a[]){
        int max = a[0];
      
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        } 
        while(max>0){
             int k=1;
            countingSortR(a,k);
            
            k*=10;
            max/=k;
        }
    }
    public void countingSortR(int a[],int k) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        int count[] = new int[max+1];
        for (int i =0; i < max+1; i++) {
            count[i] = 0;
        }
      
        for (int i = 0; i < a.length; i++) {
           // count[(a[i]/k)%10]++;      
           count[ (a[i]/k)%10 ]++; 
        }
        System.out.println("----------------------------------------------------------");
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        int tmp[] = new int[a.length];
        for (int i = a.length -1; i >=0; i--) {
            tmp[--count[(a[i]/k)%10]] = a[i];
      
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = tmp[i];
        }
    }
	void sort(int[] A, int l, int r) 
	{ 
		if (l < r) 
		{ 
			int m = (l+r)/2; 

			sort(A, l, m); 
			sort(A , m+1, r); 

			merge(A, l,m, r); 
		} 
	 }
        void merge2(int a[],int m,int lb,int ub){
            int start=lb; 
            int mid=(lb+ub)/2;  
            int K=mid+1;
            int L=lb;
            int b[]=new int[a.length];
            while(lb<=mid && K<=ub){
                if(a[lb]>=a[K]){
                    b[L]=a[K];
                    K++;
                }else{
                    b[L]=a[lb];
                    lb++;
                }
                L++;
            }
            if(lb>mid)
                while(K<=ub){
                    b[L]=a[K];
                L++;
                K++;
           }else
                while(lb<=mid){
                    b[L]=a[lb];
                    L++;
                    lb++; 
                }
            for(L=start; L<=ub; L++){
                a[L]=b[L];
            }

        }
        
    void merge(int[] A, int l, int m, int r) 
	{ 		
		int n1 = m - l + 1; 
		int n2 = r - m; 
		
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		for (int i=0; i<n1; ++i) 
			L[i] = A[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = A[m + 1+ j]; 
		int i = 0, j = 0; 	
		int k = 1;  
		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]) 
			{ 
				A[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				A[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 	
		while (i < n1) 
		{ 
			A[k] = L[i]; 
			i++; 
			k++; 
		} 

		while (j < n2) 
		{ 
			A[k] = R[j]; 
			j++; 
			k++; 
		} 
	} 
    

	
  
  
    // A utility function to get maximum value in arr[] 
    static int getMax(int arr[], int n) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < n; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    // A function to do counting sort of arr[] according to 
    // the digit represented by exp. 
    public void countSort(int arr[], int n, int exp) 
    { 
        int output[] = new int[n]; // output array 
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
        
        for (i = 0; i < n; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
    
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
     
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
       
        for (i = 0; i < n; i++) 
            arr[i] = output[i]; 
    } 
  
    public void radixSortt(int arr[], int n) 
    { 

        int m = getMax(arr, n); 

        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, n, exp); 
    } 
  
    public void print(int arr[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(arr[i]+" "); 
    } 

    
} 

