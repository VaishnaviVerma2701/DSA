import java.util.*;
class mindist{
      private static boolean bfs(ArrayList<Integer>adj[],int src,int dest,int v,int pred[],int dist[]){
    LinkedList<Integer>queue=new LinkedList<Integer>();
    boolean visited[]=new boolean[v];
    for(int i=0;i<v;i++){
        visited[i]=false;
        dist[i]=Integer.MAX_VALUE;
        pred[i]=-1;
    }
    visited[src]=true;
    dist[src]=0;
    queue.add(src);

    while(!queue.isEmpty()){
        int cur=queue.remove();
        System.out.print(cur+" ");
        for(int i=0;i<adj[u].size();i++){
            int neighbor=adj[u].get(i);
        // Iterator<Integer>i=adj[cur].listIterator();
        // while(i:hasNext()){
        //     int neighbor=i.next();
            if(visited[neighbor]==false){
                visited[neighbor]=true;
                dist[neighbor]=dist[cur]+1;
                pred[neighbor]=cur;
                queue.add(neighbor);
                if(neighbor==dest)
                return true;            
            }
        }
    }
    return false;
}

public static void main(String[] args) {
    ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
    int v=6;
    int e=8;

    int pred[]=new int[v+1];
    int dist[]=new int[v+1];
    int vist[]=new int[v+1];
    

}
}