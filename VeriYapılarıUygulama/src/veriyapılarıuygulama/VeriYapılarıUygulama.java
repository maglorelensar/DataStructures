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
public class VeriYapılarıUygulama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Stack1 s1=new Stack1(3);
     Kuyruk k=new Kuyruk(3);
     Stack2 s2=new Stack2(3);
     s1.print();
     s1.push(5);
      s1.print();
     s1.push(7);
      s1.print();
     s1.push(8);
      s1.print();
     s1.push(10);
              System.out.println("-------------------------------------------------------------");
    k.print();System.out.println("Boş |");
       
   
    
    
    
     k.push( s1.pop());
      s1.print();
     k.print();
    
    
     k.push( s1.pop());
      s1.print();
     k.print();
       
    
     k.push( s1.pop());
      s1.print();
     k.print(); System.out.println("Kuyruk Doldu!");
     
         System.out.println("-------------------------------------------------------------");
    
     s2.print();
  
   
     k.print();
     s2.push(k.pop());
     s2.print();
     
     
     k.print();
     s2.push(k.pop());
     s2.print();
     
      
     k.print();
     s2.push(k.pop());
     s2.print();
           System.out.println("-------------------------------------------------------------");
  
     
     // k.push(s1.tmp);
    // k.print();
         
     
      
    }
    
}
