/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyrukstack;

/**
 *
 * @author LENOVO
 */
public class Kuyruk extends BaseClass {
    
    public Kuyruk(int N) {
        super(N);
    }
    public Integer pop(){
        if(isEmpty()){
            System.out.println("Kuyruk boş");
            return null;
        }else{
           int tmp=dizi[0];
        for(int i=0;i<count-1;i++){
            dizi[i]=dizi[i+1];
        }
        count--;
        return tmp;
    }
   
    }}
