import java.io.*;
import java.util.*;
@SuppressWarnings("unchecked")
class dfs{
    private int V;
    private LinkedList<Integer>adj[];
    dfs(int v){
V=v;
adj=new LinkedList[v];
for(int i=0;i<v;i++){
    adj[i]=new LinkedList();
}}
void addEdge(int v,int w){
    adj[v].add(w);
}
void DFS(int s){
    boolean visited[]=new boolean[V];
   //// LinkedList<Integer>queue=new LinkedList<Integer>();
   // visited[s]=true;
//queue.add(s);
DFSUtil(s,visited);}
void DFSUtil(int v, boolean visited[]){
visited[v]=true;
    System.out.print(v+" ");

    Iterator<Integer>i=adj[v].listIterator();
    while(i.hasNext()){
        int n=i.next();
        if(!visited[n]){
           DFSUtil(n,visited);
            
        }
    }
}

public static void main(String[] args) {
    dfs b=new dfs(7);
    b.addEdge(0,1);   
     b.addEdge(0,2);
    b.addEdge(0,4);
    b.addEdge(1,0);
    b.addEdge(1,2);
    b.addEdge(1,3);    
    b.addEdge(2,5);
    b.addEdge(2,1);
    b.addEdge(3,1);     
     b.addEdge(3,4);
  b.addEdge(3,6) ; 
  b.addEdge(4,0);
  b.addEdge(4,3);  
  b.addEdge(5,2);  
  b.addEdge(5,6);
    System.out.println("start from");
    b.DFS(0);

}
    }
