import java.util.*;
class tree{
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

   static void inorder(Node root){
if(root==null) return ;
inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
   }

   static void preorder(Node root){
if(root==null) return ;
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
   }
static void postorder(Node root){
if(root==null) return ;
postorder(root.left);
postorder(root.right);
System.out.print(root.data+" ");
}

 public static void main(String[] args) {
          sc=new Scanner(System.in);
        Node root=  createTree();
        inorder(root);  
        System.out.println();    
        preorder(root);
                System.out.println();    
        postorder(root);

        
    }}
    class Node{
       int data;
   Node left,right;

 public Node(int data){
    this.data=data;
}
}

    
class tree1{
   Node root;
   static void inorder(Node root){
if(root==null) return ;
inorder(root.left);
System.out.print(root.data+" ");
inorder(root.right);
   }

   static void preorder(Node root){
if(root==null) return ;
System.out.print(root.data+" ");
preorder(root.left);
preorder(root.right);
   }
static void postorder(Node root){
if(root==null) return ;
postorder(root.left);
postorder(root.right);
System.out.print(root.data+" ");
}

 public static void main(String[] args) {
          tree1 t=new tree1();
          t.root=new Node(1);          
          t.root.left=new Node(2);
          t.root.right=new Node(3);
          t.root.left.left=new Node(4);
          t.root.left.right=new Node(5);
          t.root.right.left=new Node(6);
          t.root.right.right=new Node(7);

        inorder(t.root);  
        System.out.println();    
        preorder(t.root);
                System.out.println();    
        postorder(t.root);

        
    }}
    class Node1{
       int data;
   Node left,right;

 public Node1(int data){
    this.data=data;
}
}

    
   
   
