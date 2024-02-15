import java.util.*;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
}
class Pair{
    int hd;
    Node node;
    Pair(int hd,Node node){
        this.hd=hd;
        this.node=node;
    }
}
//vertical order traversal
class vot{
Node root;
ArrayList<Integer>vot(Node root){
    Queue<Pair> q=new ArrayDeque<>();
    Map<Integer,ArrayList<Integer>>map=new TreeMap<>();
    q.add(new Pair(0,root));
    while(!q.isEmpty()){
        Pair cur=q.poll();
        if(map.containsKey(cur.hd)){
            map.get(cur.hd).add(cur.node.data);
        }
        else{
            ArrayList<Integer>temp=new ArrayList<>();
            temp.add(cur.node.data);
            map.put(cur.hd,temp);
        }
        if(cur.node.left!=null){
            q.add(new Pair(cur.hd-1,cur.node.left));
        }
        if(cur.node.right!=null){
            q.add(new Pair(cur.hd+1,cur.node.right));
        }
    }
    ArrayList<Integer>ans=new ArrayList<>();
    //this method return the all entry of map
    for(Map.Entry<Integer,ArrayList<Integer>>entry:map.entrySet()){
ans.addAll(entry.getValue());
    }
    return ans;
}
public static void main(String[] args) {
    vot v=new vot();
    v.root=new Node(8);
    v.root.left=new Node(4);
    v.root.right=new Node(9);
        v.root.left.left=new Node(1);
    v.root.left.right=new Node(3);

    System.out.println(v.vot(v.root));
}
}
