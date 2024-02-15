import java.util.*;
 import java.util.LinkedList;
class topo {
    // No. of vertices
    private int V;
 
    // Adjacency List as ArrayList of ArrayList's
    private ArrayList<Integer>adj[];
 
    // Constructor
    topo(int v)
    {
        V = v;
        adj = new ArrayList[V];
        for (int i = 0; i < v; ++i)
            adj[i] = new ArrayList<Integer>();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v, int w) { adj[v].add(w); }
void topologicalsort(){
  int indegree[]=new int[V];
  for(int i=0;i<V;i++){
    ArrayList<Integer>list=(ArrayList<Integer>)adj[i];
    for(int node:list){
        indegree[node]++;
    }
  }  
  Queue<Integer>q= new LinkedList<Integer>();
  for(int i=0;i<V;i++){
    if(indegree[i]==0)
    q.add(i);
  }
  int cnt=0;
  ArrayList<Integer>ans=new ArrayList<Integer>();
  while(!q.isEmpty()){
    int u=q.poll();
    ans.add(u);
    for(int neighbor:adj[u]){
        if(--indegree[neighbor]==0){
            q.add(neighbor);
        }
    }
    cnt++;
  }
  if(cnt!=V){
    System.out.print("cycle exist");
    return;
  }
  for(int i:ans){
    System.out.print(i+" ");
  }
}
public static void main(String[] args){
    topo t=new topo(6);
    t.addEdge(5,2);
t.addEdge(5,0);
     t.addEdge(4,0);           
     t.addEdge(4,1);
    t.addEdge(2,3);
    t.addEdge(3,1);
    t.topologicalsort();
}
}