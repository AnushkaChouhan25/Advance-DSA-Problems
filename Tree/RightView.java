//Binary Treee Right side view
//https://leetcode.com/problems/binary-tree-right-side-view/description/

import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    // Constructor to initialize the node with a value
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class RightView {
    public static List<Integer> rightSideView(Node root) {
        List<Integer> list = new ArrayList<>();
        rightView(list, root, 0);
        return list;
    }

    public static void rightView(List<Integer> list, Node root, int level) {
        if (root == null) return;

        if (level == list.size()) list.add(root.data);
        rightView(list, root.right, level + 1);
        rightView(list, root.left, level + 1);
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

        // Get the right side view traversal
        List<Integer> list = rightSideView(root);

        // Print the result
        System.out.println("Right Side View: ");
        for (int node : list) {
            System.out.print(node + " ");
        }
    }
}
