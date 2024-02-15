import java.util.*;
// class Edge implements Comparable<Edge> {
//      static int src,dest,wt;
//     Edge(int src,int dest,int wt){
//         this.src=src;
//         this.dest=dest;
//         this.wt=wt;
//     }
//     public int compareTo(Edge that){
//         return this.wt-that.wt;
//     }
// }

// class kruskal{
//     static int p[],rank[];
//     static void union(int x,int y){
//     int rx=find(x);
//     int ry=find(y);
//     if(rx==ry) 
//     return;
//     p[ry]=rx;
// }
// static int find(int x){
//     if(p[x]==x) return x;
// return find(p[x]);
// }
// static int spanningTree(int V,ArrayList<ArrayList<Edge>>adj){
//     boolean added[][]=new boolean[V][V];
//     ArrayList<Edge>edges=new ArrayList<>();

//     for(int i=0;i<adj.size();i++){
//         for(int j=0;j>adj.get(i).size();j++){
//             ArrayList<Integer>cur=new ArrayList<>();
//             if(added[i][cur.get(0)]){
//             added[i][cur.get(0)]=true;
//             added[cur.get(0)][i]=true;
//             edges.add(new Edge(i,cur.get(0),cur.get(i)));

//             }
//         }
//     }
//     p=new int[V];
//     for(int i=0;i<V;i++){
//     p[i]=i;}
//     Collections.sort(edges);
//     int count=1;
//     int ans=0;
//     for(int i=0;count<V;i++){
//         Edge edge=edges.get(i);
//         int rx=find(edge.src);
//         int ry=find(edge.dest);
//         if(rx!=ry){
//             union(rx,ry);
//             count++;
//              ans+=edge.wt;
//          }   }
//    return ans;
// }
// //   public void addEdge(int source, int destination, int weight) {
// //         edge.add(new Edge(source, destination, weight));
// //     }
// public static void main(String[] args){
//     int V=4;
//     ArrayList<ArrayList<Edge>>edge=new ArrayList<ArrayList<Edge>>(List.of(new Edge(0,1,2)));
    
//     spanningTree(V,edge);
// }
// }


class Edge {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}

class KruskalAlgorithm {
    private int vertices;
    private List<Edge> edges;

    public KruskalAlgorithm(int vertices) {
        this.vertices = vertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int source, int destination, int weight) {
        edges.add(new Edge(source, destination, weight));
    }

    public List<Edge> kruskalMST() {
        List<Edge> result = new ArrayList<>();
        Collections.sort(edges, Comparator.comparingInt(edge -> edge.weight));

        int[] parent = new int[vertices];
        for (int i = 0; i < vertices; i++) {
            parent[i] = i;
        }

        int edgeCount = 0;
        int index = 0;

        while (edgeCount < vertices - 1 && index < edges.size()) {
            Edge nextEdge = edges.get(index++);
            int sourceParent = find(parent, nextEdge.source);
            int destParent = find(parent, nextEdge.destination);

            if (sourceParent != destParent) {
                result.add(nextEdge);
                union(parent, sourceParent, destParent);
                edgeCount++;
            }
        }

        return result;
    }

    private int find(int[] parent, int vertex) {
        if (parent[vertex] != vertex) {
            parent[vertex] = find(parent, parent[vertex]);
        }
        return parent[vertex];
    }

    private void union(int[] parent, int x, int y) {
        int xParent = find(parent, x);
        int yParent = find(parent, y);
        parent[xParent] = yParent;
    }

    public static void main(String[] args) {
        int vertices = 4;
        KruskalAlgorithm graph = new KruskalAlgorithm(vertices);

        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);

        List<Edge> mst = graph.kruskalMST();

        System.out.println("Edges in Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.println(edge.source + " - " + edge.destination + " : " + edge.weight);
        }
    }
}
