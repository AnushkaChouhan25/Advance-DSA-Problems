import java.util.ArrayList;
 
    class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;   
        } 
    }

class Ancestors {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        // root.left.right = new Node(10);
        // root.left.left.right = new Node(5);
        // root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(6);
        root.right.left = new Node(2);
        root.right.left.left = new Node(5);
        ArrayList<Integer> li= Ancestors(root,5);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }
        System.out.println();
     } 

    public static ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> list = new ArrayList<>();
       helper(root, list, target);
       return list;
    }
    public static boolean helper(Node root, ArrayList<Integer> li, int target){
         if(root == null) return false;
        if(root.data == target) return true;
         
        if((helper(root.left,li, target)) ||
        helper(root.right, li, target)){
            li.add(root.data);
            return true;
        }
        return false;
    }
}