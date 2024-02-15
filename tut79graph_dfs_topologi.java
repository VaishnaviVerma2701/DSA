import java.util.*;
class topologi{
    static  int V;
    private ArrayList<ArrayList<Integer>>adj;
    topologi(int v){
        V=v;
        adj=new ArrayList<ArrayList<Integer>>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int v,int w){
        adj.get(v).add(w);
    }
    static  void topologiUtil(ArrayList<ArrayList<Integer>>adj,int v, boolean[]visited,Stack<Integer>stack){
        visited[v]=true;
        //for(int neighbor:adj.get(v)){
            Iterator <Integer>it=adj.get(v).iterator();
            while(it.hasNext()){
                int i=it.next();
            if(!visited[i]){
                topologiUtil(adj,i,visited,stack);
            }
        }
        stack.push(v);
    }
    static int[] topologi(){
        ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>();
        Stack<Integer>stack=new Stack<>();
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topologiUtil( adj,i,visited,stack);
            }
        }
        int ans[]=new int[V];
        int i=0;
        while(!stack.isEmpty()){
            ans[i++]=stack.pop();
        }
        return ans;
    }
   
    public static void main(String[] args){
        topologi t=new topologi(6);
        t.addEdge(5,2);
        t.addEdge(5,0);
        t.addEdge(4,0);
        t.addEdge(4,1);
        t.addEdge(2,3);
        t.addEdge(3,1);
       System.out.print( t.topologi()+" ");

    }
}


 
// This class represents a directed graph
// using adjacency list representation
class topologi1 {
    // No. of vertices
    private int V;
 
    // Adjacency List as ArrayList of ArrayList's
    private ArrayList<ArrayList<Integer> > adj;
 
    // Constructor
    topologi1(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }
 
    // Function to add an edge into the graph
    void addEdge(int v, int w) { adj.get(v).add(w); }
 
    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;
 
        // Recur for all the vertices adjacent
        // to thisvertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
 
        // Push current vertex to stack
        // which stores result
        stack.push(new Integer(v));
    }
 
    // The function to do Topological Sort.
    // It uses recursive topologicalSortUtil()
void  topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();
 
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        
 
        // Call the recursive helper
        // function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);
 
        // Print contents of stack
        //int[] ans=new int[V];
        //int i=0;
        while (stack.empty() == false){
            System.out.print(stack.pop() + " ");
            //ans[i++]=stack.pop();
    }
  // return  ans;
}
    // Driver code
    // public void print(){
    //     for(int i=0;i<ans.length;i++){
    //         System.out.print(ans[i]+" ");
    //     }
    // }
    public static void main(String args[])
    {
        // Create a graph given in the above diagram
        topologi1 g = new topologi1(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
 
        System.out.println("Following is a Topological "
                           + "sort of the given graph");
        // Function Call
       g.topologicalSort();
}
}