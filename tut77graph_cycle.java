
import java.util.*;
import java.util.LinkedList;
@SuppressWarnings("unchecked")
class cycle{
    private int V;
 LinkedList<Integer>adj[];
    cycle(int v){
V=v;
adj=new LinkedList[v];
for(int i=0;i<v;i++){
    adj[i]=new LinkedList();
}
}
void addEdge(int v,int w){
    adj[v].add(w);
    adj[w].add(v);
}
Boolean isCycleUtil(int v,Boolean visited[],int parent){

    visited[v]=true;
    Integer i;
    Iterator<Integer>it=adj[v].listIterator();
    while(it.hasNext()){
        int n=it.next();
        if(!visited[n]){
            if(isCycleUtil(n,visited,v))
            return true;
        }
        else if(n!=parent)
        return true;
    }
    return false;
}

Boolean isCycle(){
Boolean visited[]=new Boolean[V];
for(int i=0;i<V;i++){
visited[i]=false;

for(int u=0;u<V;u++){
    if(!visited[u])
    if(isCycleUtil(u,visited,-1))
    return true;
}

}
return false;
}
public static void main(String[] args) {
    cycle c=new cycle(4);
    c.addEdge(0,1);   
     c.addEdge(0,2);
    c.addEdge(1,2);
    c.addEdge(2,0);
    c.addEdge(2,3);
    c.addEdge(3,3);
//    System.out.println(c.isCycle());
if(c.isCycle()){
    System.out.println("yes");
}
else{
       System.out.println("false");
 
}
}
    }

    
    class cycle1{
    private int V;
     LinkedList<Integer>adj[];
    cycle1(int v){
V=v;
adj=new LinkedList[v];
for(int i=0;i<v;i++){
    adj[i]=new LinkedList();
}
}
void addEdge(int v,int w){
    adj[v].add(w);
}
public boolean isCycle(int V,ArrayList<ArrayList<Integer>>adj){
 boolean visi[]=new boolean[V];
 for(int i=0;i< V;i++){
    if(!visi[i]){
        if(dfs(i,adj,visi,-1))
return true;
    }
 }
 return false;
}
public boolean dfs(int v,ArrayList<ArrayList<Integer>>adj,boolean visi[],int parent){
    visi[v]=true;
    for(Integer nei:adj.get(v)){
        if(!visi[nei]){
            if(dfs(nei,adj,visi,v))
            return true;
        }
        else if(parent!=nei){
            return true;
        }
    }
    return false;
}
public static void main(String[] args){
    cycle1 c=new cycle1(6);
    c.addEdge(0,1);   
     c.addEdge(0,2);
         c.addEdge(1,2);
    c.addEdge(2,3);
    c.addEdge(3,4);
        c.addEdge(4,2);
    


}
}