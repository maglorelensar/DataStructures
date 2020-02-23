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
public class Stack2 {
       
    public Integer[] dizi;
    public int count;
    public int tmp;
    public int aktarılan2;
    Kuyruk kk=new Kuyruk();

    public Stack2() {
       
    }
          public Stack2(int N){
            this.dizi=new Integer [N];
            this.count=0;
            this.aktarılan2=this.kk.tmpp;
             
        }              
      
        public Integer pop(){
            if(!this.isEmpty()){
                this.tmp=this.dizi[0];
                for(int i=0; i<count-1;i++){
                    this.dizi[i]=this.dizi[i+1];
                }
                count --;
                System.out.println("Yer Açılıor ..");
                
                return this.tmp; 
            }else{
                System.out.println("Kuyruk Boş");
                return null;
            }
        }        
        public void push (Integer aktarılan2){
            if(!this.isFull()){
                this.dizi[count++] = aktarılan2; 
                System.out.println("K-S2 Aktarılıor..");
            }else{
                System.out.println("Kuyruk Dolu Yer Lazım ");
            }
        }
    
    public boolean isEmpty(){
     return this.count == 0 ? true : false;
    }

    public boolean isFull() {
       
        return this.count == this.dizi.length ? true : false;
    }
          public void print(){
              
              System.out.println("Stack 2 Elemanlar ");              
        for(int i=0; i<count; i++){
              System.out.print(this.dizi[i]+ " ");
        }
              System.out.println("");
    }
}
