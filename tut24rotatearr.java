import java.util.*;
class roted{
    static int binary(int[] a,int k){
        int n=a.length;
        int low=0;
        int high=n-1;
        while(low<=high){
           int mid=(low+high)/2;
            if(k==a[mid]){
                return mid;
            }
            if(a[low]<a[mid]){
        if(k>=a[low]&&k<a[mid]) {
                high=mid-1;
            }
        else{
            low=mid+1;
        }}
        else{
        if(k<=a[high]&&k>a[mid]) {
           low=mid+1;
        }
    else{
     high=mid-1;
    }
}
        }
        return -1 ;   
}
 public static void main(String[] args){
    int a[]={120,130,40,30,70};
    int k=30;
   System.out.println(binary(a,k));
   for(int i=0;i<a.length;i++){
   System.out.print(a[i]+" ");
 }  
}}