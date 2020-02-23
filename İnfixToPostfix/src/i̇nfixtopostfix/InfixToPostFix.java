import java.awt.BorderLayout;
import java.util.Scanner;
import java.util.Stack;

public class InfixToPostFix {

    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '/':
            case '*':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostFix(String expression){

        String result = "";
        Stack<Character> stack = new Stack<>();
        System.out.print("Stack--> ");
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            //check if char is operator
            
            if(precedence(c)>0){
                
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
//              
                System.out.print("Stack--> "+x+" ");
                while(x!='('){
                    result += x;
                    x = stack.pop();
                    System.out.print(x);
                }
            }else if(c=='('){
                System.out.print(c);
                
                 stack.push(c);
            }else{
                //character is neither operator nor ( 
               // System.out.print(c);
                  System.out.print(" Okunan--> "+c+" ");
                result += c;
            }
           
        }  
        System.out.println(" ");
        for (int i = 0; i <=stack.size() ; i++) {
            
            result += stack.pop();
           
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
         System.out.print("Karakter Dizgisini Giriniz : ");
        String deger=s.nextLine();       
        // deger = "(A+B)/((D-C)*F)";
        System.out.println("Infix : " + deger);
        System.out.println("Postfix : " + infixToPostFix(deger));
    }
}