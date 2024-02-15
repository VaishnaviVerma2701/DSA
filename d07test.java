import java.util.*;
class pali{
    static boolean  palindrome(int[]arr,int i,int j){
        if(i>=j)
           // if(arr[i]==arr[j]){
                return true;

                if(arr[i]!= arr[j]){
                    return false;
                }
return palindrome(arr,i+1,j-1);
            }
                
         public static void main(String[] args) {
            int[] arr={1,2,9,6,1};
            int i=0;
        int j=arr.length-1;
        int c=0;
            System.out.print(palindrome(arr,i,j));
         }
}

class pali1{
    static boolean  palindrome(String s,int i,int j){
        if(i>=j)
           // if(arr[i]==arr[j]){
                return true;

                if(s.charAt(i)!= s.charAt(j)){
                    return false;
                }
return palindrome(s,i+1,j-1);
            }
                
         public static void main(String[] args) {
          String s="mom";
            int i=0;
        int j=s.length()-1;
        int c=0;
            System.out.print(palindrome(s,i,j));
         }
}


class  segregate{
    public static void evenodd(int[] arr,int n){
        int j=-1,temp;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                j++;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    public static void main(String[] args){
int[] arr={5,2,4,3,7,9,4};
        int n=arr.length;
        evenodd(arr,n);
        int i;
        for(i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}