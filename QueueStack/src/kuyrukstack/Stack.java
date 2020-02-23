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
public class Stack extends BaseClass{
    
    public Stack(int N) {
        super(N);
    }
     public Integer pop(){
        if(isEmpty()){
          System.out.println("Stack Boş");
          return null;
        }else{
              return dizi[--count];
            
        }
    }
    
}
