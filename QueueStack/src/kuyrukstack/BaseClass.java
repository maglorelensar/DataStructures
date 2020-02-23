
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuyrukstack;

public abstract class BaseClass {
     protected int dizi[];
     protected int count;

   

    public BaseClass(int N) {
        this.dizi = new int [N];
        this.count = 0;
    }
    public void push(int x){
        if(isFull()){
           System.out.println("Doldu !");      
         }else{
           dizi[count++]=x;
        }
    }
     
      
    public void print(){
        for(int i=0;i<count;i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println(" ");
    }
    boolean isEmpty(){
        return count==0 ? true:false;
    }
    boolean isFull(){
        return count==dizi.length ? true:false;
    }
                 
}
