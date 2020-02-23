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
public class KuyrukStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Kuyruk k=new Kuyruk(3);
            System.out.println("KUYRUK");
            k.push(1);k.print();
            k.push(2);k.print();
            k.push(3);k.print();
             k.push(4);k.print();
            k.pop(); k.print();
            k.pop(); k.print();
            k.pop(); k.print();
            k.pop(); k.print();
            System.out.println("-----------------------------------------------");
            System.out.println("STACK");
             Stack s=new Stack(3);
             s.push(1);s.print();
             s.push(2);s.print();
             s.push(3);s.print();
             s.push(4);s.print();
             s.pop();s.print();
             s.pop();s.print();
             s.pop();s.print();
             s.pop();s.print();
             
    }
    
}
