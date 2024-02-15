import java.util.*;
class frequancy{
    public static void frequancyof(int[]arr,int n){
        int i,c=0;
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
                            System.out.println(arr[i]+" =="+c);
c=0;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,3,1,2,1,7,6};
        int n=arr.length;
        
        frequancyof(arr,n);
    }
}