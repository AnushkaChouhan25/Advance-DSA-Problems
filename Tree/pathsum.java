//Path Sum
//https://leetcode.com/problems/path-sum/description/

public class pathsum {static class Node {
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
    root.left = new Node(1);
    root.left.left = new Node(3);
    // root.left.right = new Node(10);
    // root.left.left.right = new Node(5);
    // root.left.left.right.right = new Node(6);
    root.right = new Node(4);
    root.right.right = new Node(5);
    root.right.left = new Node(1);

    System.out.println(hasPathSum(root, 7));
}
    public static boolean hasPathSum(Node root, int targetSum) {
        if(root == null) return false; 
        
        if(root.left == null && root.right == null){
            return targetSum == root.val;
        }
            
        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        System.out.println(leftSum);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);
        System.out.println(rightSum);
        
        return leftSum || rightSum;
    }
}
