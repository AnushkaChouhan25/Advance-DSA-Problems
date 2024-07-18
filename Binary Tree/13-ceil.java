public class ceil {
    static  class Node {
        int data;
        Node left;
        Node right;
        Node(int val) {
            this.data = val;   
        } 
    }
    public static void main(String[] args) {
        int a = 5;
        Node root = new Node(10);
        root.left = new Node(5);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.right = new Node(8);
        // root.left.left.right.right = new Node(6);
        root.right = new Node(11);
        root.right.right = new Node(12);
        // root.right.left = new Node(9);
        System.out.println(findCeil(root, 6));
        
    }
    // Function to return the ceil of given number in BST.
    static int findCeil(Node root, int key) {
    int ceil = -1;
        while(root != null){
            if(root.data == key){
                System.out.println(ceil);
                ceil = root.data;
                return ceil;
            }
            if(root.data < key){
                root = root.right;
            }
            else{
                ceil = root.data;
                System.out.println(ceil);
                root = root.left;
            }
        }
        System.out.println(ceil);
            return ceil;
    }
}