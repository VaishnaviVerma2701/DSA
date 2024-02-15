import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class pairsum{
    Node root;
    public boolean findpair(Node root,int sum,HashSet<Integer>set){
        if(root==null) return false;
        if(findpair(root.left,sum,set)==true){
        return true;}
        if(set.contains(sum-root.data)){
            System.out.println("pair is=" +(sum-root.data)+" "+root.data );
            return true;
        }
        set.add(root.data);
        return findpair(root.right,sum,set);
    }

    int isfindpair(Node root,int target){
        HashSet<Integer>set=new HashSet<>();
       boolean ans=findpair(root,target,set);
       if(ans==true)
       return 1;

       return 0;
    }

    public static void main(String[] args) {
        pairsum p=new pairsum();
        p.root=new Node(8);
        p.root.left=new Node(6);
        p.root.right=new Node(9);
        int target=14;
        System.out.println(p.isfindpair(p.root,target));

    }
}