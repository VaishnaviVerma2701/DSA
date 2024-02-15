import java.util.*;
class bubblesort{
    public static void bubbleSort(int[] arr,int n){
        System.out.println("acending order is =");
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
           if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;

            // int temp=arr[j+1];
            // arr[j+1]=arr[j];
            // arr[j]=temp;
           }}}
        } 
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        int n=5;
        bubbleSort(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}

//selection sort
class selection{
    public static void selectionSort(int[]arr,int n){
        System.out.println("acending  order =");
        for(int i=0;i<n-1;i++){
        int smallest=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[smallest]){
            smallest=j; 
            }}
        //swap(i,smallest)
        int temp=arr[i];
        arr[i]=arr[smallest];
arr[smallest]=temp;
}
    } 
    public static void main(String[] args) {
        int[] arr={3,1,5,8,2};
        int n=5;
        selectionSort(arr,n); // calling for function
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

class insertion{
    public static void insertionSort(int[] arr,int n){
                System.out.println("acending order =");
        for( int i=1;i<n;i++){
            int curr=arr[i];
            int j;
            for( j=i-1;j>=0;j--){
            if(curr<arr[j]){
                arr[j+1]=arr[j];   
            }
            else{
                break;
            }
        }
            arr[j+1]=curr;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,6,5,1,2,3,4,5}; 
        int n=5;
        insertionSort(arr,n);
        for( int i=0;i<n;i++){
System.out.print(arr[i]+" ");
        }
    }
}

//quick sort
class quick{
     public static int findpivot(int[]arr,int s,int e){
        int i=s-1;
        int j;
        int pivot=arr[e];
for(j=s;j<e;j++){  //e me pivot hai es liye <e karege
    if(arr[j]<pivot){
        i++;
        //swap(i,j)
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
//swap(i,e)   swap pivot int i
i++;
int temp=arr[i];
arr[i]=arr[e];
arr[e]=temp;
return  i;

     }
     public static void quicksort(int[]arr,int s,int e ){
        if(s<e){
            int pi=findpivot(arr,s,e);
            quicksort(arr,s,pi-1);
            quicksort(arr,pi+1,e);
        }  
     }
     public static void main(String[] args) {
        int[]arr={5,2,1,6,7,4};
        //int s=0;
        //int e=arr.length-1;
        int n=arr.length;
        quicksort(arr,0,n-1);
        for(int i=0;i<n;i++){
System.out.print(arr[i]+" ");
        }
    }
}

