import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
class ancestor{
    Node root;
    Node lca(int n1,int n2){ // in this make call the lca function 
        return lca( root, n1, n2);
    }
Node lca(Node root,int n1,int n2){ // because diarect call this function than return error
    if(root==null) return null;

    if(root.data==n1||root.data==n2)return root;

    Node left=lca(root.left,n1,n2);
    Node right=lca(root.right,n1,n2);

    if(left==null) return right;
    if(right==null) return left;

    return root;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ancestor a=new ancestor();
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    a.root=new Node(2);
    a.root.left=new Node(6);    
    a.root.right=new Node(4);
    a.root.left.left=new Node(2);    
    a.root.left=new Node(7);   
    System.out.println(a.lca(n1,n2).data); 

}
}