 import java.util.*;
 class largearea{
 
int largeArea(int[][]a){
int currRow[]=a[0];
int maxAns=maxhistogram(currRow);
for(int i=1;i<a.length;i++){
    for(int j=0;j<a[0].length;j++){
        if(a[i][j]==1){
            currRow[j]+=1;
        }
        else{
            currRow[j]=0;
        }}
        int currans=maxhistogram(currRow);
         maxAns=Math.max(maxAns,currans);
    
}
return maxAns;
}

 int  maxhistogram(int[]a){
        int maxans=0;
        int ps[]=prevSmaller(a);
        int ns[]=nextSmaller(a);
for(int i=0;i<a.length;i++){
    int curr=(ns[i]-ps[i]-1)*a[i];
    maxans=Math.max(maxans,curr);
}
return maxans;
    }
    
    int[] prevSmaller(int[] a){
        int ps[]=new int[a.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() &&a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public int[] nextSmaller(int[]a){
         int ns[]=new int[a.length];
        Stack<Integer>s=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() &&a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=-1;
            }
            else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }

public static void main(String[] args) {
    largearea l=new largearea();
    int[][] a={{0,1,1,1,1,0},{1,1,1,1,0,1},{1,1,0,1,1,1},{1,1,1,1,1,0}};
    System.out.println(l.largeArea(a));
}
}