import java.util.*;
class graph{
    static void addEdge(int a[][],int source,int dest){
        a[source][dest]=1;
        a[dest][source]=1;
    }
    static void addEdge1(ArrayList<ArrayList<Integer>>adj,int source,int dest){
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
    public static   void print(ArrayList<ArrayList<Integer>> adj){
        for(int i=0;i<adj.size();i++){
for(int j=0;j<adj.get(i).size();j++){
System.out.print(adj.get(i).get(j)+" ");
}
System.out.println();
        }
    }

    public static void main(String[] args) {
        graph g=new graph();
        int v=5;
        int edge=10;
        int a[][]=new int[v+1][v+1];

        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<v;i++)
            adj.add(new ArrayList<Integer>());
        
        addEdge1(adj,0,1);
addEdge1(adj,0,4);
addEdge1(adj,1,2);
addEdge1(adj,1,3);
addEdge1(adj,1,4);
addEdge1(adj,2,3);
addEdge1(adj,3,4);

print(adj);
    }
}