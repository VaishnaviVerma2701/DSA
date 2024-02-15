
    import java.io.*;
import java.util.*;
class GFG {
// Function of spanning tree
static int spanningTree(int V, int E, int edges[][])
    {
         ArrayList<ArrayList<Pair>> adj=new ArrayList<>();
         for(int i=0;i<V;i++)
         {
             adj.add(new ArrayList<Pair>());
         }
         for(int i=0;i<edges.length;i++)
         {
             int u=edges[i][0];
             int v=edges[i][1];
             int wt=edges[i][2];
             adj.get(u).add(new Pair(v,wt));
             adj.get(v).add(new Pair(u,wt));
         }
         PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
         pq.add(new Pair(0,0));
         int[] vis=new int[V];
         int s=0;
         while(!pq.isEmpty())
         {
             Pair node=pq.poll();
             int v=node.v;
             int wt=node.wt;
             if(vis[v]==1)
             continue;
              
             s+=wt;
             vis[v]=1;
             for(Pair it:adj.get(v))
             {
                 if(vis[it.v]==0)
                 {
                     pq.add(new Pair(it.v,it.wt));
                 }
             }
         }
         return s;
    }
     
static class Pair implements Comparable<Pair>
{
    int v;
    int wt;
    Pair(int v,int wt)
    {
        this.v=v;
        this.wt=wt;}
    public int compareTo(Pair that){
    
         return this.wt-that.wt;
      } 
    }
     
    // Driver code
    public static void main (String[] args) {
        int graph[][] = new int[][] {{0,1,5}};
                                   // {1,2,3},
                                    //{0,2,1}};
  
        // Function call
        System.out.println(spanningTree(2,1,graph));
}
}



class iPair {
    int first, second;
    public iPair(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}
 
// This class represents a directed graph using
// adjacency list representation
class prims {
    int V; 
 
    
    List<List<iPair> > adj;
 
    prims(int V)
    {
        this.V = V;
        adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
    }
 
    // function to add an edge to graph
    void addEdge(int u, int v, int w)
    {
        adj.get(u).add(new iPair(v, w));
        adj.get(v).add(new iPair(u, w));
    }
 
    // Print MST using Prim's algorithm
    void primMST()
    {
        PriorityQueue<iPair> pq = new PriorityQueue<>(
            V, new Comparator<iPair>() {
                public int compare(iPair a, iPair b)
                {
                    return a.second - b.second;
                }
            });
 
        int src = 0; 
 
        
       
       
        boolean[] inMST = new boolean[V];
 
        
        pq.offer(new iPair(0,0));
        int ans=0;
 
        /* Looping till priority queue becomes empty */
        while (!pq.isEmpty()) {
            // The first vertex in pair is the minimum key
            // vertex, extract it from priority queue.
            // vertex label is stored in second of pair (it
            // has to be done this way to keep the vertices
            // sorted key (key must be first item
            // in pair)
            iPair k= pq.poll();
            int l=k.second;
    
            if (inMST[l]==true) {
                continue;
            }
 ans+=k.second;
            inMST[l] = true; // Include vertex in MST
 
            // 'i' is used to get all adjacent vertices of a
            // vertexweight
            for (iPair i : adj.get(l)) {
                // Get vertex label and weight of current
                // adjacent of u.
                int v = i.first;
                int weight = i.second;
 
                //  If v is not in MST and weight of (u,v)
                //  is smaller
                // than current key of v
                if(inMST[v]==false){
                    pq.add(new iPair(v,weight));
                }
                }
            }
            System.out.println(ans);
        }   
    }

 
// Driver class
 class prims1 {
    public static void main(String[] args)
    {
        // create the graph given in above figure
        int V = 9;
 
        prims graph1 = new prims(V);
 
        //  making above shown graph
        //graph1.addEdge(0, 1, 5);
        // graph1.addEdge(0, 7, 8);
         graph1.addEdge(1, 2, 3);
        graph1.addEdge(0, 2, 1);
        // graph1.addEdge(2, 3, 7);
        // graph1.addEdge(2, 8, 2);
        // graph1.addEdge(2, 5, 4);
        // graph1.addEdge(3, 4, 7);
        // graph1.addEdge(3, 5, 4);
        // graph1.addEdge(4, 5, 0);
        // graph1.addEdge(5, 6, 2);
        // graph1.addEdge(6, 7, 1);
        // graph1.addEdge(6, 8, 6);
        // graph1.addEdge(7, 8, 7);
 
        graph1.primMST();
}
}