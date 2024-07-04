//Diameter of Binary Tree
//https://leetcode.com/problems/diameter-of-binary-tree/


    //  Definition for a binary tree node.
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

public class Diameter{
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        // root.left.right.right = new TreeNode(6);
        // root.left.right.right.right = new TreeNode(7);

        solution tree = new solution();
        int di = tree.diameterOfBinaryTree(root);
        System.out.println(di);
    }
}
class solution{
    public int diameterOfBinaryTree(TreeNode root) {

        return diameter(root);
    }
    public static int diameter(TreeNode root){
        if(root == null) return 0;

        int ldiam = diameter(root.left);
        int lh = height(root.left);
        int rdiam = diameter(root.right);
        int rh = height(root.right);

        int selfdiam = lh + rh ;
        return Math.max(selfdiam, Math.max(ldiam, rdiam));
    }
    public static int height(TreeNode root){
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right)+1;
    }
}