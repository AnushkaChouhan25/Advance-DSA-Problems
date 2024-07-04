//Count Good Nodes in Binary Tree
//https://leetcode.com/problems/count-good-nodes-in-binary-tree/

public class CountGoodNodes {
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
        root.left = new Node(1);
        root.left.left = new Node(3);
        // root.left.right = new Node(10);
        // root.left.left.right = new Node(5);
        // root.left.left.right.right = new Node(6);
        root.right = new Node(4);
        root.right.right = new Node(5);
        root.right.left = new Node(1);

        System.out.println(goodNodes(root));

    }
    public static int goodNodes(Node root) {
        if(root == null) return 0; 
        return helper(root, root.val);
    }
    public static int helper(CountGoodNodes.Node root, int max) {
        if(root == null) return 0;

        int ans;
        if(max <= root.val) {
            ans = 1; 
            System.out.println("when max <= root.val --ans-"+ ans);
        }else {
            ans =0;
            System.out.println("when max >= root.val --ans -"+ ans);
        }
        max = Math.max(max, root.val);
        System.out.println("left call ------>");
        ans += helper(root.left, max);
        System.out.println("after left ans is " + ans);
        System.out.println("Right call ------>");
        ans += helper(root.right,max);
        System.out.println("after right ans +" + ans);
        return ans;
    }
    
}
