//import java.util.Scanner;
import java.util.Arrays;
class d04arr{
     public static void main(String[] args) {
        
       // Scanner sc=new Scanner(System.in);
        int n=5;
        int i=0;
        int j=n-1;
        int k;
        int a[]={1,0,1,1,0};
        while(i<j){
            if(a[i]==0){
                i++;
            }
            if(a[j]==1){
                j--;
            }
            if(i<j && a[i]==1&& a[j]==0){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        }
        for(k=0;k<n;k++)
        System.out.println(a[k]);
    }
}
class arrk{
public static void main(String[] args) {
    
int arr[]={1,4,45,6,10,8};
Arrays.sort(arr);
int x=16;
int n=5;
	    int i=0;
	    int j=n-1;
        
	    while(i<j){
	        if(arr[i]+arr[j]==x){
                System.out.println("true");
	            return;
	        }
	        else if(arr[i]+arr[j]<x){
	            i++;
	        }
	        else{
	            j--;
	        }
	    }
	     System.out.println("false");


    }
}

class d4arr2 {
    public static void main(String[] args) {
    int arr[]={4,2,5,7}; 
    int n=4;
        int[] Lmax=new int[n];
        int[] Rmin=new int[n];
        int i;
        Lmax[0]=arr[0];
        for( i=1;i<n;i++){
            Lmax[i]=Math.max(arr[i],Lmax[i-1]);
                    System.out.println(Lmax[i]);

        }
        Rmin[n-1]=arr[n-1];
            for(i=n-2;i>=0;i--){
                Rmin[i]=Math.min(arr[i],Rmin[i+1]);
                        System.out.println(Rmin[i]);

            }            
int ans=-1;
for(i=1;i<n;i++){
    if(arr[i]==Lmax[i]&&arr[i]==Rmin[i]){
        System.out.println(arr[i]);
       return;
    }
}
System.out.println(ans);
    }
}

class d4arr3 {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        int temp;
        int i=0;
        
int j=nums.length-1;
        for(i=0;i<nums.length;i++){
         if(i>j){
temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;


         }
        }
           
    }
}