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
public class Stack1 {
    
   public Integer[] dizi;
    public int count;
    public int tmp;

    public Stack1() {
       
    }
    
      public Stack1(int N){
            this.dizi=new Integer [N];
            this.count=0;
             
        }              
      
        public Integer pop(){
            if(!this.isEmpty()){
                this.tmp=this.dizi[0];
                for(int i=0; i<count-1;i++){
                    this.dizi[i]=this.dizi[i+1];
                }
                count --;
                System.out.println("S1--K Aktarılıor ..");
                
                return this.tmp; 
            }else{
                System.out.println("Kuyruk Boş");
                return null;
            }
        }        
        public void push (Integer a){
            if(!this.isFull()){
                this.dizi[count++] = a; 
                System.out.println("Elemanlar Ekleniyor..");
            }else{
                System.out.println("Stack 1 Doldu Taşıyor! ");
            }
        }
    
    public boolean isEmpty(){
     return this.count == 0 ? true : false;
    }

    public boolean isFull() {
       
        return this.count == this.dizi.length ? true : false;
    }
          public void print(){
              System.out.println("Stack 1 Elemanlar ");
        for(int i=0; i<count; i++){
              System.out.print(this.dizi[i]+ " ");
        }
              System.out.println("");
    }

}
