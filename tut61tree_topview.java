import java.util.*;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class topview{
    Node root;
    public void topView(Node root){
        Queue<Pair>q=new ArrayDeque<>();
        Map<Integer,Integer>map=new TreeMap<>();
        q.add(new Pair(0,root));
        while(!q.isEmpty()){
            Pair curr=q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
        
        if(curr.node.right!=null){
            q.add(new Pair(curr.hd+1,curr.node.right));
        }
    }
    ArrayList<Integer>ans=new ArrayList<>();
    for(Map.Entry<Integer,Integer>entry:map.entrySet()){
        ans.add(entry.getValue());
    }
   System.out.print( ans);
}
public static void main(String[] args) {
    topview t=new topview();
    t.root=new Node(1);
    t.root.left=new Node(2);
    t.root.right=new Node(3);
    t.root.left.right=new Node(4);
    t.root.left.right.right=new Node(5);
    t.root.left.right.right.right=new Node(6);
    t.topView(t.root);
    

}
}
class Pair{
    int hd;
    Node node;
    public Pair(int hd,Node node){
        this.node=node;
        this.hd=hd;
    }
}

