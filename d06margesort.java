//import java.util.*;
class marge{

    public static void marge1(int[]arr,int s,int mid,int e){
    
        int n1 = mid-s+1;
        int n2 = e-mid; //e-(m+1)-1;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0 ; i<n1 ; i++){
            L[i] = arr[s+i];
        }
        for(int j=0 ; j<n2 ; j++){
            R[j] = arr[mid+1+j];
        }

        int i=0;
        int j=0;
        int k=s;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
                k++;
            }
            else{
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<n1){ //R is completed , elements still remaining in L
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j<n2){ //L is completed , elements still remaining in R
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void divide(int arr[], int s, int e)
    {
        if(s<e){
            int mid = (s+e)/2;
            divide(arr,s,mid); //left -> s to m
            divide(arr,mid+1,e); //right -> m+1 to e

            marge1(arr,s,mid,e);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,9,7,5};
        int n = arr.length;
        divide(arr , 0 , n-1);
        for(int i=0 ; i<n ; i++)
                System.out.print(arr[i]+" ");
    }
}