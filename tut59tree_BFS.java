import java.util.*;
class Solution1
{
    static Scanner sc=null;
    static Node createTree(){
        Node root=null;
        System.out.println("enter data :");
        int data=sc.nextInt();

        if(data==-1)return null;

        root=new Node(data);
        System.out.println("enter left for"+ data);
        root.left=createTree();

        System.out.println("enter right for"+ data);
        root.right=createTree();

        return root;
   }
    //Function to return the level order traversal of a tree.
   // static ArrayList <Integer> levelOrder(Node node) 
 static void levelOrder(Node root)
    {
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
       if(root==null){
     //System.out.println("queue is empty")  //q.add(null);
       }
        q.add(root);
    while(!q.isEmpty()){
        Node x=q.remove();

        // if(x==null){
        //     if(q.isEmpty())
        //     return null;

        //     q.add(null);
        // }
        if(x.left!=null){
        q.add(x.left);}
        if(x.right!=null){
        q.add(x.right);}
        ans.add(x.data);
    }
     System.out.println(ans);
    }

    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node node=createTree();
        // System.out.println(levelOrder(node));
levelOrder(node);
    }
}
class Node1{
    int data;
Node left,right;

public Node1(int data){
this.data=data;
}}



// Class to represent Tree node
class Node {
    int data;
    Node left, right;
 
    public Node(int item)
    {
        data = item;
        left = null;
        right = null;
    }
}
 
// Class to print Level Order Traversal
class BinaryTree {
 
    Node root;
 
    // Given a binary tree. Print
    // its nodes in level order
    // using array for implementing queue
    void printLevelOrder(Node root)
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {
 
            // poll() removes the present head. 
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
 
            // Enqueue left child
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
 
            // Enqueue right child
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
 
    public static void main(String args[])
    {
        // Creating a binary tree and entering
        // the nodes
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);
 
        System.out.println("Level order traversal of binary tree is - ");
              tree_level.printLevelOrder(tree_level.root);
}
}
