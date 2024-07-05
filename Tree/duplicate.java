import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class duplicate {
    static  class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            this.data = data;   
        } 
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        // root.left.right = new Node(10);
        // root.left.left.right = new Node(5);
        // root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        List<Node> li= printAllDups(root);
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i).data);
        }
        System.out.println();
     } 

    public static List<Node> printAllDups(Node root) {
        // code here
        List<Node> list=new ArrayList<>();
         HashMap<String,Integer> hash=new HashMap<>();
        find(root,list,hash);
        return list;
        
    }
        // code here
      static  String str="";
    public static String find(Node root,List<Node> list,HashMap<String,Integer> hash){
        
        if(root==null) { 
            return "N";
        }
        str=root.data+","+find(root.left,list,hash)+","+find(root.right,list,hash);
        
        
        if(hash.containsKey(str)) hash.put(str,hash.get(str)+1);
        else hash.put(str,1);
        
        if(hash.get(str)==2){
            list.add(root);
        } 
    return str;
    }
} 