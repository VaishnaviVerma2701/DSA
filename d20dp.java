import java.util.*;

//top down method
class dp{
    static  int fib[]=new int[7];
    public static int fibo(int n ){
if(n==0||n==1)
return n;
else if(fib[n]!=0) // if solutuon are exist
return fib[n];
else // else compute 
fib[n]=fibo(n-1)+fibo(n-2); //compute and store the result
return fib[n];

    }
    public static void main(String[] args) {
        int n=6;
        fib[0]=0;
         fib[1] = 1;
        System.out.println(fibo(n));
    }
}


//bottom up
class  dp1{
    public static int fibo1(int n){
        int[] fib=new int[n+1];
fib[0]=0;
fib[1]=1;

for(int i=2;i<=n;i++){
    fib[i]=fib[i-1]+fib[i-2];
}
return fib[n];
    }
    public static void main(String[] args) {
        int n=5;
        int[] fib=new int[n+1];
        System.out.println(fibo1(n));
    }
}
