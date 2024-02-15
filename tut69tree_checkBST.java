import java.util.*;
class Node1{
    int data;
    Node left,right;
    Node1(int data){
        this.data=data;
    }
}
class checkBST1{
    Node root;
    // ArrayList<Integer>ans=new ArrayList<>();
    Node prev=null;
boolean isBST(Node root){
    
        if(root!=null){
           if(!isBST(root.left))
           return false;
           
           if(prev!=null && root.data<=prev.data)
        return false;

        prev=root;
        return isBST(root.right);
        }
            return true;
        }  
public static void main(String[] args) {
    checkBST1 b=new checkBST1();
    b.root=new Node(70);
    b.root.left=new Node(50);    
    b.root.right=new Node(80);
   System.out.println( b.isBST(b.root));

}
}

//in this  set the min max value first and check one by one 
// if element not range of min and max than return false
class Node{
    int data;
    Node left,right;
Node(int data){
    this.data=data;
}
}
class checkBST{
    Node root;
    boolean IsBST(Node root){ // this is call to isBSTUtil function
        return IsBSTUtil(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
}
boolean IsBSTUtil(Node root,int min,int max){ //direaction calling the show error
    if(root==null)
    return true;

    if(root.data<min||root.data>max)
    return false;

    return (IsBSTUtil(root.left,min,root.data-1)&& IsBSTUtil(root.right,root.data+1,max));
}
public static void main(String[] args) {
    checkBST c=new checkBST();
    c.root=new Node(90);
    c.root.left=new Node(50);    
    c.root.right=new Node(100);
System.out.println(c.IsBST(c.root));

}
}


