import java.util.*;
class sizeoftree{
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

   static int sizeofTree(Node root){
    if(root==null)
    return 0;

    return sizeofTree(root.left)+sizeofTree(root.right)+1;
   }
   public static void main(String[] args) {
    sc=new Scanner(System.in);
  Node root=  createTree();
  System.out.println(sizeofTree(root));
  
}}
class Node1{
 int data;
Node left,right;

public Node1(int data){
this.data=data;
}
}




class sizeoftree1{
  Node root;
    int sizeofTree(Node root){
    if(root==null)
    return 0;

    return sizeofTree(root.left)+sizeofTree(root.right)+1;
   }
   public static void main(String[] args) {
    sizeoftree1 s=new sizeoftree1();
    s.root=new Node(1);  
      s.root.left=new Node(2);
       s.root.right=new Node(3);

      s.root.left.left=new Node(4);
      s.root.left.right=new Node(5);

  
  System.out.println(s.sizeofTree(s.root));
  
}}
class Node{
 int data;
Node left,right;

public Node(int data){
this.data=data;
}
}


