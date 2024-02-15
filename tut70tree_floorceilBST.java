import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}

class FlorandCeil{
    Node root;
    int floorvalue(Node root,int key){
        int ans=Integer.MAX_VALUE;
        // if(root==null){
        //     return ans; if root is null then return infinity
        // }
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data > key){
                root=root.left;
            }
            else{
                ans= root.data;
                root=root.right;
            }
        }
        return ans;
    }

    int ceilvalue(Node root,int key){
        int ans=Integer.MIN_VALUE;
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
            if(root.data>key){
                ans=root.data;
                root=root.left;
            }
            else{
                root=root.right;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
    FlorandCeil f=new FlorandCeil();
    int key=80;
    f.root=new Node(90);
    f.root.left=new Node(50);
    f.root.right=new Node(100);
    System.out.println(f.floorvalue(f.root,key));    
    System.out.println(f.ceilvalue(f.root,key));


    }
}