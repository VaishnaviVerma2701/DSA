import java.util.*;

//if  method are static than we dont need to  class object

//least  common value in two array
class S {
    public  static  int getCommon(int[] nums1, int[] nums2) {
         int n=nums1.length;
        int m=nums2.length;
       for( int i=0;i<n;){
           for(int j=0;i<m;){
               if(nums1[i]==nums2[j]){
               
                return nums1[i];
                }
                if(nums1[i]<nums2[j]){
                    ++i;
                }
                else{
                    ++j;
                }
       }
       }
       return -1;
     }
     public static void main(String[] args) {
        int[] nums1={2,3,4,5};
        int [] nums2={2,4};
        System.out.println(getCommon(nums1,nums2));
     } 
 
}

// least comman value in 2 array
class arr {
    public static void main(String[] args) {
        int[] nums1={2,3,4,5};
        int [] nums2={2,4};
        Arrays.sort(nums1);       
         Arrays.sort(nums2);
         int n=nums1.length;
        int m=nums2.length;
       for( int i=0;i<n;){
           for(int j=0;i<m;){
               if(nums1[i]==nums2[j]){
               
              System.out.println(nums1[i]);
             return;
                }
                if(nums1[i]<nums2[j]){
                    ++i;
                }
                else{
                    ++j;
                }
       }
       }
       System.out.println("-1");
     
     }
}

//find squer root of number
class squl{
    public static  int mysqrl(int x){
        int i;
        for(i=0;i<=x;i++){
            int p=i*i;
            if(p==x){
                return i;
            }
            if(p>x){
                        return i-1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int x=64;
        System.out.println(mysqrl(x));
    }
}

//Sqrt root of number
class Sqrt {
    public  static int mySqrt(int x) {
        if (x==0)
        return 0;
    if (x>0 && x<4)
        return 1;        
    int left = 1, right = x/2;
    while (true) {
        int mid = (left + right)/2;            
        if (mid > 0 && mid > x/mid) {
            right = mid-1;
        } else if ((mid+1) > x/(mid+1)) {
            return mid;
        } else {
            left = mid+1;
        }
    }
    }
    public static void main(String[] args) {
        Sqrt s1=new Sqrt();
        int x=8;
        // System.out.println(mySqrt(x));
        mySqrt(x);
    }
}