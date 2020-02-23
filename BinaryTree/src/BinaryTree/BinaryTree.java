package BinaryTree;


public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void add(Node instance) {
        root = addRecursive(root, instance);
    }

    private Node addRecursive(Node root, Node instance) {
        if (root == null) {
            return instance;
        } else if (root.getData() > instance.getData()) {
            root.setLeft(addRecursive(root.getLeft(), instance));
        } else if (root.getData() < instance.getData()) {
            root.setRight(addRecursive(root.getRight(), instance));
        } else {
            return root;
        }
        return root;
    }

    public Node search(Node instance) {
        return searchRecursive(root, instance);
    }

    private Node searchRecursive(Node root, Node instance) {
        if (root != null) {
            if (root.getData() == instance.getData()) {
                return root;
            }
            if (root.getData() > instance.getData()) {
                return searchRecursive(root.getLeft(), instance);
            } else if (root.getData() < instance.getData()) {
                return searchRecursive(root.getRight(), instance);
            }
        }

        return null;
    }

    public Node delete(Node instance) {
        return deleteRecursive(root, instance);
    }

    private Node deleteRecursive(Node root, Node instance) {
        if (root == null) {
            return null;
        }
        if (root.getData() == instance.getData()) {
            if (root.getLeft() == null && root.getRight() == null) {
                return null;
            } else if (root.getLeft() != null && root.getRight() != null) {

                Node tmp = findMin(root.getRight());
//                deleteRecursive(root.getRight(),tmp);
                tmp.setLeft(root.getLeft());
                tmp.setRight(root.getRight());
                root=tmp;

                return root;
            }
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            return null;
        }
        if (root.getData() > instance.getData()) {
            root.setLeft(deleteRecursive(root.getLeft(), instance));
        } else if (root.getData() < instance.getData()) {
            root.setRight(deleteRecursive(root.getRight(), instance));
        }

        return root;
    }

    public void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.getLeft());
            System.out.print(" " + root.getData());
            traverseInOrder(root.getRight());
        }
    }
     public void traversePreOrder(Node root) {
        if (root != null) {
            System.out.print(" " + root.getData());
            traversePreOrder(root.getLeft());
            
            traversePreOrder(root.getRight());
        }
    }
      public void traversePostOrder(Node root) {
        if (root != null) {
            
            traversePostOrder(root.getLeft());
            
            traversePostOrder(root.getRight());
            System.out.print(" " + root.getData());
        }
    }

    public Node findMin(Node root) {
        return root.getLeft() == null ? root : findMin(root.getLeft());
    }

    public Node findMax(Node root) {
        return root.getRight() == null ? root : findMax(root.getRight());
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

}
