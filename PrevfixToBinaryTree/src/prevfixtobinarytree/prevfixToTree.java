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
public class prevfixToTree {

    boolean operantmi(char c) {
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;
        }
        return false;
    }

    // Utility function to do inorder traversal 
    void inorder(Dugum t) {
        if (t != null) {
            inorder(t.sol);
            System.out.print(t.deger + " ");
            inorder(t.sag);
        }
    }
    void postorder(Dugum t) {
        if (t != null) {
            System.out.print(t.deger + " ");
            inorder(t.sol);
            
            inorder(t.sag);
        }
    }
    void prevorder(Dugum t) {
        if (t != null) {
            inorder(t.sol);
            
            inorder(t.sag);
            System.out.print(t.deger + " ");
        }
    }

    
    Dugum prevfixTree(char postfix[]) {
        Stack<Dugum> st = new Stack();
        Dugum t, t1, t2;

        // Traverse through every character of 
        // input expression 
        for (int i = 0; i < postfix.length; i++) {

            // If operand, simply push into stack 
            if (!operantmi(postfix[i])) {
                t = new Dugum(postfix[i]);
                st.push(t);
            } else // operator 
            {
                t = new Dugum(postfix[i]);

                // Pop two top nodes 
                // Store top 
                t1 = st.pop();      // Remove top 
                t2 = st.pop();

                //  make them children 
                t.sag = t1;
                t.sol = t2;

                // System.out.println(t1 + "" + t2); 
                // Add this subexpression to stack 
                st.push(t);
            }
        }

        //  only element will be root of expression 
        // tree 
        t = st.peek();
        st.pop();

        return t;

    }
}
