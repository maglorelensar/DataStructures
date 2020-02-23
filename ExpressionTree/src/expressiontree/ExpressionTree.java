package expressiontree;

import java.util.Stack; 


class Dugum { 

	char value; 
	Dugum sol; 
        Dugum sag;

	Dugum(char item) { 
		value = item; 
		sol = sag = null; 
	} 
} 

class ExpressionTree { 
    

	boolean isOperator(char c) { 
		if (c == '+' || c == '-'
				|| c == '*' || c == '/'
				|| c == '^') { 
			return true; 
		} 
		return false; 
	} 


	void inorder(Dugum t) { 
		if (t != null) { 
			inorder(t.sol); 
			System.out.print(t.value + " "); 
			inorder(t.sag); 
		} 
	} void preorder(Dugum t) { 
		if (t != null) { 
                    System.out.print(t.value + " "); 
			inorder(t.sol); 
			inorder(t.sag); 
		} 
	} void postorder(Dugum t) { 
		if (t != null) { 
			inorder(t.sol); 
			inorder(t.sag); 
                        System.out.print(t.value + " "); 
		} 
	} 


	Dugum constructTree(char postfix[]) { 
		Stack<Dugum> st = new Stack(); 
        Dugum t; 
		Dugum t1, t2; 

		
		for (int i = 0; i < postfix.length; i++) { 

			
			if (!isOperator(postfix[i])) { 
				t = new Dugum(postfix[i]); 
				st.push(t); 
			} else 
			{ 
				t = new Dugum(postfix[i]); 

				
				t1 = st.pop();	 
				t2 = st.pop(); 

				
				t.sag = t1; 
				t.sol = t2; 

			
				st.push(t); 
			} 
		} 

		
		t = st.peek(); 
		st.pop(); 

		return t; 
                
	} 

	public static void main(String args[]) { 
                InfixToPostFix ip=new InfixToPostFix();
		ExpressionTree et = new ExpressionTree(); 
		String postfix = ip.infixToPostFixx("(a+b)/(c-d)");
		char[] charArray = postfix.toCharArray(); 
		Dugum r= et.constructTree(charArray);
                System.out.println("Ağacın İlk Durumu");
                System.out.println("(a+b)/(c-d)");
                System.out.println("PreOrder  "); et.preorder(r);
               System.out.println(" ");
                 System.out.println("InOrder = ");et.inorder(r); 
		          System.out.println("");
                 System.out.println("PostOrder = ");  et.postorder(r);
             
                         
              
             

	} 
} 


