
public class CreateBST {
    static  class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;   
        } 
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(root.val);
            root = insert(root, arr[i]);
        }

        inorder(root);
    }
    public static void inorder(CreateBST.Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right); 
    }
    public static Node insert(Node root, int value){
        if(root == null) {
            root = new Node(value);
            return root;
        }
        if(root.val > value){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;

    }
}
