//Height of a binary tree



//Definition for a binary tree node.
class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
           this.right = right;
        }
}

public class Height {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
        // root.left.left = new TreeNode(3);
        // root.left.left.left = new TreeNode(4);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
         root.right.right = new TreeNode(6);
        //  root.left.right.right = new TreeNode(6);
        //  root.left.right.right.right = new TreeNode(7);

        Solution tree = new Solution();
        int di = tree.diameterOfBinaryTree(root);
        System.out.println(di);
    }
}
class Solution {
    int diameter;

    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0; 
        helper(root); 
        return diameter;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            System.out.println("root null");
            return 0;
        } 

        int left = helper(root.left);  
        int right = helper(root.right);

        diameter = Math.max(diameter, left + right);
        System.out.println("diameter in helper"+ diameter);
        
        System.out.println("---------------done from left and right ------------" + left + right);
        System.out.println(Math.max(left, right) + 1);
        return Math.max(left, right) + 1;
    } 
}
