package expressiontree;
import java.util.Stack;

public class InfixToPostFix {

    public int precedence(char c){
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

    public String infixToPostFixx(String expression){

        String result = "";
        Stack<Character> stack = new Stack<>();       
        for (int i = 0; i <expression.length() ; i++) {
            char c = expression.charAt(i);

            
            if(precedence(c)>0){
                
                while(stack.isEmpty()==false && precedence(stack.peek())>=precedence(c)){
                    result += stack.pop();
                }
                stack.push(c);
            }else if(c==')'){
                char x = stack.pop();
          
                while(x!='('){
                    result += x;
                    x = stack.pop();
                  
                }
            }else if(c=='('){
              
                
                 stack.push(c);
            }else{
            
                result += c;
            }
           
        }  
       
        for (int i = 0; i <=stack.size() ; i++) {
            
            result += stack.pop();
           
        }
        return result;
    }

 
}