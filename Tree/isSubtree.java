//Subtree of Another Tree
//https://leetcode.com/problems/subtree-of-another-tree/description/


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

public class isSubtree {
    public static void main(String[] args){

        TreeNode root = new TreeNode(3);
         root.left = new TreeNode(4);
         root.right = new TreeNode(5);
         root.left.left = new TreeNode(1); 
         root.left.right = new TreeNode(2);
        //  root.left.right.left = new TreeNode(0);

         // root.left.left = new TreeNode(3);
         // root.left.left.left = new TreeNode(4);
         //  root.right.right = new TreeNode(6);
         //  root.left.right.right = new TreeNode(6);
        //  root.left.right.right.right = new TreeNode(7);

        TreeNode subRoot = new TreeNode(4);
        subRoot.left = new TreeNode(1);
        subRoot.right = new TreeNode(2);

        Solution tree = new Solution();
       System.out.println(tree.isSubtree(root, subRoot));
    }
}

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
           if(root == null) return false;

           if(root.val == subRoot.val){
            if(isIdentical(root, subRoot)){
                return true;
            }
           }
           return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean isIdentical(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;

        else if(root == null || subRoot == null || root.val != subRoot.val){
            return false;
        }
        if(!isIdentical(root.left, subRoot.left)) return false;

        if(!isIdentical(root.right, subRoot.right)) return false;

        return true;
    }
     
}