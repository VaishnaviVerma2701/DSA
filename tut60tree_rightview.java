    
 import java.util.*;
// class rightview{
//   Node root;
//     static Scanner sc=null;

//     static void printleftview(Node root ,ArrayList list,int level){
//     if(root==null) 
//     return ;
//     if(list.get(level)==null){
//       list.set(level,root);
//     }
//     printleftview(root.left,list,level+1);
//        printleftview(root.right,list,level+1);
// }
//  void printleft(Node root){
//     ArrayList<Node>list=new ArrayList<>();
//     printleftview(root,list,0);
//     for(Node curr: list){
//         System.out.print(curr.data+" ");
//     }
// }
//    public static void main(String[] args) {
//     sc=new Scanner(System.in);
//     rightview r=new rightview();
//     r.root=new Node(1);    r.root.left=new Node(2);
//     r.root.right=new Node(3);
//     r.root.left.left=new Node(1);
//     r.root.left.right=new Node(7);
//      r.root.right.left=new Node(9);
//     r.root.right.right=new Node(8);

//   //System.out.println(sizeofTree(root));
//   r.printleft(r.root);
// }
// }
// class Node{
//  int data;
// Node left,right;

// public Node(int data){
// this.data=data;
// }
// }



   
class rightview1{
  Node root;
    void printview(Node root){
      if(root==null){
        return ;
      }
      Queue<Node>q=new LinkedList<>() ;
        q.add(root);
        while(!q.isEmpty()){
          int n=q.size();
          for(int i=0;i<n;i++){
            Node cur=q.peek();
            q.remove();

            if(i==n-1){
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
  
    rightview1 r=new rightview1();
    r.root=new Node(1);    r.root.left=new Node(2);
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



   
