//Balanced Binary Tree
//https://leetcode.com/problems/balanced-binary-tree/description/

public class isbalance {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3); 
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        // Solution tree = new Solution();
       System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(TreeNode root) {
        if (root == null) { 
            return true;
        }
        System.out.println("calling isBalanced");

        int left = height(root.left);
        System.out.println("left height is ---------" + left);
        int right = height(root.right);
        System.out.println("right height is ---------" + right);
        
        
        if (Math.abs(left - right) <= 1 && isBalanced(root.left) &&
        isBalanced(root.right)) {
            return true;
            }
            return false;
    }
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
        }   

}
