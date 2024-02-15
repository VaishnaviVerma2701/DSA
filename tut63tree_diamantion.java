import java.util.*;

//time complexity O(n^2);

class Node{
    int data;
    Node left,right;
    public  Node(int data){
this.data=data;
    }
}
class diamantion{
    Node root;
    public  static int  Diamantion(Node root){
        if(root==null){
            return 0;
        }
        int dl=Diamantion(root.left);
        int dr=Diamantion(root.right);
        int cur=hight(root.left)+hight(root.right);
        return Math.max(cur,Math.max(dl,dr));
    }

    public static int hight(Node root){
        if(root==null){
            return 0;
        }
        return  Math.max(hight(root.left),hight(root.right))+1;
    }

    public static void main(String[] args) {
        diamantion d=new diamantion();
        d.root=new Node(1);
        d.root.left=new Node(2);
        d.root.right=new Node(3);
        d.root.right.left=new Node(4);
        d.root.right.right=new Node(5);
       // d.root.right.right.left=new Node(6);
        //d.root.right.right.right=new Node(7);
     System.out.print(Diamantion(d.root));
    }

}

//time complexity O(n);

class Node1{
    int data;
    Node left,right;
    public  Node1(int data){
this.data=data;
    }
}
class diamantion1{
    Node root;
    public  static int  Diamantion(Node root){
        if(root==null){
            return 0;
        }
        int dl=Diamantion(root.left);
        int dr=Diamantion(root.right);
        int cur=hight(root.left)+hight(root.right);
        return Math.max(cur,Math.max(dl,dr));
    }
 static int ans=0;
    public static int hight(Node root){
        if(root==null){
            return 0;
        }
        int lh=hight(root.left);
        int rh=hight(root.right);
        ans=Math.max(ans,lh+rh+1);
        return  Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        diamantion1 d=new diamantion1();
        d.root=new Node(1);
        d.root.left=new Node(2);
        d.root.right=new Node(3);
        d.root.right.left=new Node(4);
        d.root.right.right=new Node(5);
       // d.root.right.right.left=new Node(6);
        //d.root.right.right.right=new Node(7);
     System.out.print(Diamantion(d.root));
    }

}