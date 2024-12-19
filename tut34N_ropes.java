import java.util.*;
class ropes{
int mincost(int[]a){
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    for(int i=0;i<a.length;i++){
        pq.add(a[i]);
    }
    System.out.println(pq);
    int ans=0;
    while(pq.size()>1){
        int first=pq.remove();
        int second=pq.remove();
        int sum=first+second;
        ans=ans+sum;
        pq.add(sum);
    }
    return ans;
}
public static void main(String[]args){
    ropes r=new ropes();
    int a[]={2,5,4,8,6,9};
    System.out.println(r.mincost(a));

    
}
}