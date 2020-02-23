
package deletionavltree;


public class Tree {
    Node root; 


	int height(Node N) 
	{ 
		if (N == null) 
			return 0; 
		return N.height; 
	} 

	
	int max(int a, int b) 
	{ 
		return (a > b) ? a : b; 
	} 


	Node rightRotate(Node y) 
	{ 
		Node x = y.left; 
		Node T2 = x.right; 

		
		x.right = y; 
		y.left = T2; 

		
		y.height = max(height(y.left), height(y.right)) + 1; 
		x.height = max(height(x.left), height(x.right)) + 1; 

		
		return x; 
	} 

	
	Node leftRotate(Node x) 
	{ 
		Node y = x.right; 
		Node T2 = y.left; 

		
		y.left = x; 
		x.right = T2; 

		
		x.height = max(height(x.left), height(x.right)) + 1; 
		y.height = max(height(y.left), height(y.right)) + 1; 

		
		return y; 
	} 

	
	int getBalance(Node N) 
	{ 
		if (N == null) 
			return 0; 
		return height(N.left) - height(N.right); 
	} 

	Node insert(Node node, int key) 
	{ 
		
		if (node == null) 
			return (new Node(key)); 

		if (key < node.key) 
			node.left = insert(node.left, key); 
		else if (key > node.key) 
			node.right = insert(node.right, key); 
		else 
			return node; 

		
		node.height = 1 + max(height(node.left), 
							height(node.right)); 

		
		int balance = getBalance(node); 

		//Left Left Durumu
		if (balance > 1 && key < node.left.key) 
			return rightRotate(node); 

		// Right Right Durumu 
		if (balance < -1 && key > node.right.key) 
			return leftRotate(node); 

		// Left Right Durumu 
		if (balance > 1 && key > node.left.key) 
		{ 
			node.left = leftRotate(node.left); 
			return rightRotate(node); 
		} 

		// Right Left Durumu 
		if (balance < -1 && key < node.right.key) 
		{ 
			node.right = rightRotate(node.right); 
			return leftRotate(node); 
		} 

		
		return node; 
	} 

	
	Node minValueNode(Node node) 
	{ 
		Node current = node; 

		
		while (current.left != null) 
		current = current.left; 

		return current; 
	} 

	Node deleteNode(Node root, int key) 
	{ 
	
		if (root == null) 
			return root; 

		
		if (key < root.key) 
			root.left = deleteNode(root.left, key); 

		
		else if (key > root.key) 
			root.right = deleteNode(root.right, key); 

		
		else
		{ 

		
			if ((root.left == null) || (root.right == null)) 
			{ 
				Node temp = null; 
				if (temp == root.left) 
					temp = root.right; 
				else
					temp = root.left; 

				// Çocuğu olmadığı Durum
				if (temp == null) 
				{ 
					temp = root; 
					root = null; 
				} 
				else 
					root = temp; 
			} 
			else
			{ 

				
				Node temp = minValueNode(root.right); 

				
				root.key = temp.key; 

				
				root.right = deleteNode(root.right, temp.key); 
			} 
		} 

	
		if (root == null) 
			return root; 

		root.height = max(height(root.left), height(root.right)) + 1; 

		
		int balance = getBalance(root); 

	
		// Left Left Durumu 
		if (balance > 1 && getBalance(root.left) >= 0) 
			return rightRotate(root); 

		// Left Right Durumu 
		if (balance > 1 && getBalance(root.left) < 0) 
		{ 
			root.left = leftRotate(root.left); 
			return rightRotate(root); 
		} 

		// Right Right Durumu 
		if (balance < -1 && getBalance(root.right) <= 0) 
			return leftRotate(root); 

		// Right Left Durumu 
		if (balance < -1 && getBalance(root.right) > 0) 
		{ 
			root.right = rightRotate(root.right); 
			return leftRotate(root); 
		} 

		return root; 
	} 

	
	void preOrder(Node node) 
	{ 
		if (node != null) 
		{ 
			System.out.print(node.key + " "); 
			preOrder(node.left); 
			preOrder(node.right); 
		} 
}	void inOrder(Node node) 
	{ 
		if (node != null) 
		{ 			
			inOrder(node.left); 
                        System.out.print(node.key + " "); 
			inOrder(node.right); 
		} 
}
	void postOrder(Node node) 
	{ 
		if (node != null) 
		{ 			 
			postOrder(node.left); 
			postOrder(node.right); 
                        System.out.print(node.key + " ");
		} 
}
}
