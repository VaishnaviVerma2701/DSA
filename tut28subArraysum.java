import java.util.*;
class subarr{
     static void subArraysum(int[]arr,int sum){
        int cursum=0;
        int start=0;
        int end=-1;
        int n=arr.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            cursum+=arr[i];
            if(cursum==0){
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(cursum-sum)){
                start=map.get(cursum-sum)+1;
                end=i;
                break;
            }
            map.put(cursum,i);
        }
     if(end==-1){
        System.out.println("not");
     }
     System.out.println(start+" "+end);

    }
    public static void main(String[] args){
int[] arr={23,45,1,43,8};
int sum=46;
subArraysum(arr,sum);
    }
}