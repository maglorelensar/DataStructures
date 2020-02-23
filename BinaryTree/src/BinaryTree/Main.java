package BinaryTree;

public class Main {

    public static void main(String[] args) {
        BinaryTree t = new BinaryTree(); 
        t.add(new Node(25));
        t.add(new Node(15));
        t.add(new Node(17));
        t.add(new Node(16));
        t.add(new Node(18));
        t.add(new Node(10));
        t.add(new Node(13));
        t.add(new Node(11));
        t.add(new Node(14));
        t.add(new Node(30));
        t.add(new Node(27));
        t.add(new Node(35));
        t.add(new Node(31));
        t.add(new Node(34));
        t.add(new Node(33));
        t.add(new Node(12));
        System.out.print("Inorder Dizilim >>");
         t.traverseInOrder(t.getRoot());
         System.out.println("");
        System.out.println("18 sayısı var mı ?");
         System.out.println(t.search(new Node(18)) != null ? "var" : "yok");
    
        System.out.println("7 sayısı var mı ?");
        System.out.println(t.search(new Node(7)) != null ? "var" : "yok");
         
//        
     System.out.println("11 sayısı siliniyor ..");
        t.delete(new Node(11));
        System.out.print("PreOrder Dizilim >>");
        t.traversePreOrder(t.getRoot());
        System.out.println("");
         System.out.print("Inorder Dizilim >>");
        t.traverseInOrder(t.getRoot());
        System.out.println("");
        System.out.print("PostOrder Dizilim >>");     
        t.traversePostOrder(t.getRoot());
        System.out.println("");
    }

}
