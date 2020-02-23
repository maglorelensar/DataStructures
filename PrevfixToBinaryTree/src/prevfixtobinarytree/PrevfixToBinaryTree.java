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


public class PrevfixToBinaryTree {

    

    public static void main(String args[]) {
        infixToPostfix itp=new  infixToPostfix();
        
        prevfixToTree ptt = new prevfixToTree();
        
        String postfix = itp.infixToPostfix("(a+b)*(c-d)");
        char[] charDizi = postfix.toCharArray();
        Dugum root = ptt.prevfixTree(charDizi);
        System.out.println("Sıralanmadan Önce");
        System.out.println("(a+b)*(c-d)");
        System.out.println("İnOrder Sıralama Tree");
        ptt.inorder(root);
        System.out.println(" ");
        System.out.println("Postorder Sıralama Tree");
        ptt.postorder(root);
        System.out.println(" ");
        System.out.println("Prevorder Sıralama Tree");
        ptt.prevorder(root);

    }

}
