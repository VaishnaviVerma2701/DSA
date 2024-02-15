import java.util.*;
import java.util.LinkedList;

class Solutionk
{
    Node root;
   
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
    static ArrayList <Integer> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(node);
    while(!q.isEmpty()){
        Node x=q.remove();
        if(x.left!=null){
        q.add(x.left);}
        if(x.right!=null){
        q.add(x.right);}
        
        ans.add(x.data);
    }
      return ans;
    }

    public static void main(String[] args) {
        sc=new Scanner(System.in);
        Node node=createTree();
        System.out.println(levelOrder(node));

    }
}
 class Node{
        int data;
        Node next;
        Node left,right;
        Node(int data){
this.data=data;
        }
    }