import java.util.*;
class bellman{
    public int isnegativeweightCycle(int n,int[][]edges){
        int dist[]=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;

        for(int count=1;count<n;count++){
            for(int j=0;j<edges.length;j++){
                int src=edges[j][0];
                int dest=edges[j][1];
                int weight=edges[j][2];
if(dist[src]!=Integer.MAX_VALUE && dist[src]+weight<dist[dest]){
    dist[dest]=dist[src]+weight;
}
            }
        }
        for(int j=0;j<edges.length;j++){
            int src=edges[j][0];
            int dest=edges[j][1];
            int weight=edges[j][2];
if(dist[src]!=Integer.MAX_VALUE && dist[src]+weight<dist[dest]){
dist[dest]=dist[src]+weight;
return 1;
    }
}
return 0;
}
public static void main(String[]args){
    int[][]edges={{0,1,-1},{1,2,-2},{2,0,-3}};
    int n=3;
    bellman b=new bellman();
System.out.println(b.isnegativeweightCycle(n,edges));
}
}