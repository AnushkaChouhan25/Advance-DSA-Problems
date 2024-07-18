//Top View of binary Tree

import java.util.*;

public class TopView {
// Node structure for the binary tree
static class Node {
    int data;
    Node left;
    Node right;
    
    // Constructor to initialize
    // the node with a value
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
static class Pair{
    int line;
    Node node; 
    
    // Constructor to initialize
    // the node with a value
    public Pair(Node node, int line) {
        this.node = node;
        this.line = line;
    }
}
   
    public static List<Integer> topView(Node root) {
        List<Integer> list = new ArrayList<>();

        if (root == null) return list;


        Queue<Pair> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max =0;
        q.add(new Pair(root, 0));
        System.out.println("------------" + new Pair(root, 0));
        
        while (!q.isEmpty()) {
            System.out.println("----------------------------------");
            Pair p = q.poll();

            if (!map.containsKey(p.line)) {
                map.put(p.line, p.node);
                System.out.println("Map elements ---" +   map.size());
            }

            if (p.node.left != null) {
                q.add(new Pair(p.node.left, p.line - 1)); 
                System.out.println("queuue------" +   q.peek().line);
                min = Math.min(min, p.line - 1);
            }
            
            if (p.node.right != null) {
                q.add(new Pair(p.node.right, p.line + 1));
                System.out.println("queuue------" +  q.peek().line);
                max = Math.max(max, p.line + 1);
            }
        }

                for(int i = min; i <= max; i++){
                    list.add(map.get(i).data);
                }
                return list;
        }
    public static void main(String[] args) {
        // Creating a sample binary tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        // Get the top view traversal
        List<Integer> list = topView(root);

        // Print the result
        System.out.println("Vertical Traversal: ");
        for (int node : list) {
            System.out.print(node + " ");
        }
    }
}
