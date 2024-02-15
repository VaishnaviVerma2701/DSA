import java.util.*;

// find one non repeating element
class xor1 {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 1, 93, 4, 5, 1 };
        int n = arr.length;
        int i = arr[0];
        for (int j = 1; j < n; j++) {
            i = (i ^ arr[j]);
        }
        System.out.println(i);

    }
}


// find two non repeating element

class xor{
    public static void main(String[] args) {
        int[]arr={5,4,1,2,93,4,5,1};
        int n=arr.length;
        int i=arr[0];
        for(int j=1;j<n;j++){
             i=(i^arr[j]);
        }
        int r=i & ~(i-1);
        int a=0,b=0;
        for(int k=0;k<n;k++){
int x=arr[k];
if((x&r)!=0){
    a=a^x;
}
else{
    b=b^x;
}
        }
        System.out.print(a+" "+b);

    }
}
