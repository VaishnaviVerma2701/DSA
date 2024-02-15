
import java.util.*;
//kth largest element using min heap
class pq2{
  public static  int kthelement(int a[],int k){
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        Arrays.sort(a);
for(int i=0;i<k;i++){
    pq.add(a[i]);
}
for(int i=k;i<a.length;i++){
    if(pq.peek()<a[i]){
        pq.remove();
        pq.add(a[i]);
    }
}
return pq.peek();
    }
    public static void main(String[] args) {
        //add
int a[]={5,2,7,4,1};
int k=3;
System.out.println(kthelement(a,k));

    }}

//kth smallest element using max heap
    class pq3{
  public static  int kthsmall(int a[],int k){
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(a);
for(int i=0;i<k;i++){
    pq.add(a[i]);
}
for(int i=k;i<a.length;i++){
    if(pq.peek()>a[i]){
        pq.remove();
        pq.add(a[i]);
    }
}
return pq.peek();
    }
    public static void main(String[] args) {
        //add
int a[]={5,2,7,4,1,6,3,0};
int k=3;
System.out.println(kthsmall(a,k));

    }}

    //kth largest element using max heap
    class pq4{
  public static  int kthelement(int a[],int k){
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(a);
for(int i=0;i<a.length;i++){
    pq.add(a[i]);
}
for(int i=0;i<k-1;i++){
    pq.remove();  
    }
return pq.peek();
    }
    public static void main(String[] args) {
        //add
int a[]={5,2,7,4,1,2,0,8};
int k=3;
System.out.println(kthelement(a,k));
 }
}

//kth smallest element using min heap
class pq5{
  public static  int kthelement(int a[],int k){
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        Arrays.sort(a);
for(int i=0;i<a.length;i++){
    pq.add(a[i]);
}
for(int i=0;i<k-1;i++){
    pq.remove();  
    }
return pq.peek();
    }
    public static void main(String[] args) {
        //add
int a[]={5,2,7,4,1,2,0,8};
int k=3;
System.out.println(kthelement(a,k));
 }
}


