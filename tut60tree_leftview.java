 import java.util.*;
class leftview{
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

   static void printleftview(Node root ,ArrayList list,int level){
    if(root==null) return ;
    if(list.get(level)==null){
      list.add(root);
    }
    printleftview(root.left,list,level+1);
       printleftview(root.right,list,level+1);
}
static void printleft(Node root){
    ArrayList<Node>list=new ArrayList<>();
    printleftview(root,list,0);
    for(Node curr: list){
        System.out.print(curr.data+" ");
    }
}
   public static void main(String[] args) {
    sc=new Scanner(System.in);
  Node root=  createTree();
  //System.out.println(sizeofTree(root));
  printleft(root);
}
}
class Node1{
 int data;
Node left,right;

public Node1(int data){
 this.data=data;
 }
 }


 
class leftview1{
  Node root;
    void printview(Node root){
      if(root==null){
        return ;
      }
      Queue<Node>q=new LinkedList<>() ;
        q.add(root);
        while(!q.isEmpty()){
          int n=q.size();
          for(int i=1;i<=n;i++){
           // Node cur=q.peek();
             Node cur =q.remove();

            if(i==1){
              System.out.print(cur.data);
              System.out.print(" ");
            }

            if(cur.left!=null){
              q.add(cur.left);
            }

             if(cur.right!=null){
              q.add(cur.right);
            }
          }
        }
      
    }

    
   public static void main(String[] args) {
  
    leftview1 r=new leftview1();
    r.root=new Node(1);   
     r.root.left=new Node(2);
    r.root.right=new Node(3);
    r.root.left.left=new Node(1);
    r.root.left.right=new Node(7);
     r.root.right.left=new Node(9);
    r.root.right.right=new Node(8);

  //System.out.println(sizeofTree(root));
  r.printview(r.root);
}
}
class Node{
 int data;
Node left,right;

public Node(int data){
this.data=data;
}
}


   

