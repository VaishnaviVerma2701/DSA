import java.util.*;
//normal solution
class slid{
    static void printKMax(int[] arr,int n,int k){
        int j,max;
        for(int i=0;i<=n-k;i++){
            max=arr[i];
            for(j=1;j<k;j++){
                if(arr[i+j]>max)
                max=arr[i+j];
            }
            System.out.print(max+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int k=3;
        int n=arr.length;
        printKMax(arr,n,k);
    }
}


//using avl tree ,using queue
class slid1{
    static ArrayList<Integer>findMaxElement(int[] arr,int n,int k){
        PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> res=new ArrayList<>();
    
        for(int i=0;i<k;i++)
           queue.add(arr[i]);
        
           //adding the maximum element among first k element
           res.add(queue.peek());

           //remove the first  element in array
           queue.remove(arr[0]);

           //Iterating for the next element
for(int i=0;i<n;i++){
    //adding the new element in window
    queue.add(arr[i]);

//finding and adding the max element in the current sliding window
res.add(queue.peek());
queue.remove(arr[i-k+1]);
}
        return res;
    }

    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,8,9,0,7};
        int k=3;
        int n=arr.length;
        ArrayList<Integer>ans=findMaxElement(arr,n,k);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}