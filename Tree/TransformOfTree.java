class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=null;
        right=null;
    }
} 

public class TransformOfTree{
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 
        toSumTree(root) ;
    }
    public static void toSumTree(Node root){
        //add code here.
          dfs(root);
   }
   public static int dfs(Node root){
       if(root == null) return 0;
       
       int left = dfs(root.left);
       int right = dfs(root.right);
       int data = root.data;
       int newleft = root.left == null?0 : root.left.data;
       int newright = root.right == null ?0: root.right.data;
       
       root.data = newleft + left + right + newright;
       
       return data;
   }
}