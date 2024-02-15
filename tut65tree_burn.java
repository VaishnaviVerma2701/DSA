import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
}
}

class Depth{
    Node root;
    int d;
    public Depth(int d){
        this.d=d;
    }}
    class Depth1{
    public static int minTime(Node root,int target){
Depth depth=new Depth(-1);
burn(root,target,depth);
return ans;
    }
    static int ans=-1;
    public static int burn(Node root,int target,Depth depth){
        if(root==null) return 0;
        if(root.data==target){
            depth.d=1;
return 1;
        }
        Depth ld=new Depth(-1);
        Depth rd=new Depth(-1);

        int lh=burn(root.left,target,ld);
        int rh=burn(root.right,target,rd);

        if(ld.d!=-1){
            ans=Math.max(ans,ld.d+1+rh);
            depth.d=ld.d+1;
        }
        else if(rd.d!=-1){
            ans=Math.max(ans,rd.d+1+lh);
            depth.d=rd.d+1; 
        }
        return Math.max(lh,rh)+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        Depth1 d1=new Depth1();
        d1.root=new Node(1);
        d1.root.left=new Node(2);
        d1.root.right=new Node(3);
        d1.root.left.left=new Node(4);
        d1.root.left.right=new Node(5);
        d1.root.right.left=new Node(6);
        d1.root.right.right=new Node(7);
        System.out.println(minTime(d1.root,target).d);
    }
}}