/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prevfixtobinarytree;

import java.util.Stack;

/**
 *
 * @author Casper
 */
public class infixToPostfix {
    // A utility function to return precedence of a given operator 
    // Higher returned value means higher precedence 
    public static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 
       
     
   public  String infixToPostfix(String exp) 
    { 
        // Sonuç Ları Atabilecegimiz bir String degişkeni oluşturuyoruz
        String Sonuc = new String(""); 
          
        // Boş Bir Stack Oluşturuyoruz Javanın Stack Sıınıfından  
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<exp.length(); ++i) 
        { 
            char c = exp.charAt(i); 
              
             // If the scanned character is an operand, add it to output. 
            if (Character.isLetterOrDigit(c)) 
                Sonuc += c; 
               
            // If the scanned character is an '(', push it to the stack. 
            else if (c == '(') 
                stack.push(c); 
              
            //  If the scanned character is an ')', pop and output from the stack  
            // until an '(' is encountered. 
            else if (c == ')') 
            { 
                while (!stack.isEmpty() && stack.peek() != '(') 
                    Sonuc += stack.pop(); 
                  
                if (!stack.isEmpty() && stack.peek() != '(') 
                    return "Hata"; // invalid expression                 
                else
                    stack.pop(); 
            } 
            else // an operator is encountered 
            { 
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())){ 
                    if(stack.peek() == '(') 
                        return "Hata"; 
                    Sonuc += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        // pop all the operators from the stack 
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Hata"; 
            Sonuc += stack.pop(); 
         } 
        return Sonuc; 
    } 
}
