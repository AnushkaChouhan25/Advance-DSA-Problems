//Lowest Common Ancestor of a Binary Tree
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/

public class LCA{
    static class Node {
        int val;
        Node left;
        Node right;
        
        // Constructor to initialize
        // the node with a value
        public Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        root.right.left.left = new Node(4);
        root.right.left.right = new Node(7);
        System.out.println(lca(root, 6, 2).val);
    }
    public static Node lca(Node root, int n1, int n2) {
        if(root == null) return null;

        if(root.val == n1 || root.val == n2) {
            System.out.println("root value--------->" + root.val);
            return root;
        }
        System.out.println(root.left.val);
        Node left = lca(root.left, n1, n2);
        System.out.println("left val --->" + left.val);
        
        System.out.println(root.right.val);
        Node right = lca(root.right, n1, n2);
        System.out.println("right val --->" + right.val);

        if(left == null) return right;
        if(right == null) return left; 
        System.out.println("root val ------->" + root.val);
        return root;
        }
}