import java.util.*;
 
class dijstra {
    private int V;
    private List<List<iPair>> adj;
 
    dijstra(int V) {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }
 
    void addEdge(int u, int v, int w) {
        adj.get(u).add(new iPair(v, w));
        adj.get(v).add(new iPair(u, w));
    }
 
    void shortestPath(int src) {
        boolean[] vis=new boolean[V];
        PriorityQueue<iPair> pq = new PriorityQueue<>(V, Comparator.comparingInt(o -> o.first));
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
 
        pq.add(new iPair(0, src));
        ans[src] = 0;
 
        while (!pq.isEmpty()) {
            int u=pq.remove().second;
            if(vis[u]==true){
                continue;
            }
            vis[u]=true;
            for (iPair v : adj.get(u)) {
                if (ans[v.first] > ans[u] + v.second) {
                    ans[v.first] = ans[u] + v.second;
                    pq.add(new iPair(ans[v.first], v.first));
                }
            }
        }
 
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t\t" + ans[i]);
        }
    }
 
    static class iPair {
        int first, second;
 
        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
 
 class dis {
    public static void main(String[] args) {
        int V = 9;
        dijstra g = new dijstra(V);
 
        g.addEdge(0, 1, 4);
        g.addEdge(0, 7, 8);
        g.addEdge(1, 2, 8);
        g.addEdge(1, 7, 1);
        g.addEdge(2, 3, 7);
        g.addEdge(2, 8, 2);
        g.addEdge(2, 5, 4);
        g.addEdge(3, 4, 8);
        g.addEdge(3, 5, 1);
        g.addEdge(4, 5, 0);
        g.addEdge(5, 6, 2);
       g.addEdge(6, 7, 1);
       g.addEdge(6, 8, 6);
        g.addEdge(7, 8, 7);
 
        g.shortestPath(0);
}
}


class Solution2
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here private int
 
        boolean[] vis=new boolean[V];
        PriorityQueue<iPair> pq = new PriorityQueue<>(V, Comparator.comparingInt(o -> o.first));
        int[] ans = new int[V];
        Arrays.fill(ans, Integer.MAX_VALUE);
 
        pq.add(new iPair(0, S));
        ans[S] = 0;
 
        while (!pq.isEmpty()) {
            // cur=pq.remove();
             int u=pq.remove().second;
            if(vis[u]==true){
                continue;
            }
            vis[u]=true;
            ArrayList<ArrayList<Integer>>neighbor=adj.get(u);
            for (ArrayList<Integer> v : neighbor) {
                int first=v.get(0);
                int second=v.get(1);
                if (ans[first] > ans[u] + second) {
                    ans[first] = ans[u] + second;
                    pq.add(new iPair(ans[first], first));
                }
        }
    }
               
        return ans;
    }
    static class iPair {
        int first, second;
 
        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
public static void main(String[] args){
   ArrayList<ArrayList<ArrayList<Integer>>>adj= new ArrayList<ArrayList<ArrayList<Integer>>>(Arrays.asList({{{1, 1}, {2, 6}}, {{2, 3}, {0, 1}}, {{1, 3}, {0, 6}}}));
   int S=2;
   int V=3;
   dijkstra(V,adj,S);
}

}