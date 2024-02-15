import java.util.*;

//binary search in infinate array
class binary1{
     public static int binary(int[] a,int key,int low,int high) {
        low=0;
        high=a.length-1;
        while (low <= high) {
            int m = (low + high) / 2;
            if (key == a[m]) {
                return m;
            } else if (key > a[m]) {
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        return low;
    }
    public static int binarysearch(int[]a,int key,int low,int high){
        
        if(a[high]<key)
            low=high;
            high=high*3;
return binary(a,key,low,high);
  }

    public static void main(String[] args) {
        int[]a={1,2,3,6,7,8,9,23,45,78, 80 };
        int key=90;
       int low=0;
       int  high=1;
       int n=a.length;
       
        int j=binarysearch(a,key,low,high);
        System.out.println(j);
    }
}
