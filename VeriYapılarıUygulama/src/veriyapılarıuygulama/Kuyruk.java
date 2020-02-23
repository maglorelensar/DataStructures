/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veriyapılarıuygulama;

/**
 *
 * @author LENOVO
 */
public class Kuyruk {
     public Integer[] dizi;
    public int count;
    public int aktarılan1;
    public int tmpp;
    Stack1 ss=new Stack1();
    
    
   

    public Kuyruk() {
        
    }
    
      public Kuyruk(int N){
            this.dizi=new Integer [N];
            this.count=0;
            this.aktarılan1=this.ss.tmp;
        }              
      
        public Integer pop(){
            if(!this.isEmpty()){
                this.tmpp=this.dizi[0];
                for(int i=0; i<count-1;i++){
                    this.dizi[i]=this.dizi[i+1];
                }
                count --;
                
                return tmpp; 
            }else{
                System.out.println("Kuyruk Boş");
                return null;
            }
        }        
        public void push (Integer aktarılan1){
            if(!this.isFull()){
                this.dizi[count++] = aktarılan1;                
            }else{
                System.out.println("Kuyruk Dolu");
            }
        }
    
    public boolean isEmpty(){
     return this.count == 0 ? true : false;
    }

    public boolean isFull() {
       
        return this.count == this.dizi.length ? true : false;
    }
          public void print(){
           System.out.print("Kuyruktaki Elemanlar = ");
        for(int i=0; i<count; i++){
            System.out.print(this.dizi[i]+ " "+"|  ");
        }
             
    }

}
