import java.util.*;
import java.util.Arrays;

// find prime number btw 2 numbers using seive Of EratoSthenes method;

class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");

        int n=sc.nextInt();
        boolean isprime[]=seiveOfEratoSthenes(n);
        for(int i=0;i<=n;i++){
            System.out.println(i+" "+isprime[i]);
        }
    }
    public static boolean[] seiveOfEratoSthenes(int n){
        boolean isprime[]= new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;       
         isprime[1]=false;
         for(int i=2;i*i<=n;i++){
            for(int j=2*i;j<=n;j+=i){
                isprime[j]=false;
            }
         }
return isprime;
 }
    
}

class prime1{
public static void Prime(int x){
int count=0;
for(int i=1;i<x;i++){
    if(x%i==0){
        count++;
    }}
    if(count==1){
        System.out.println(x + "is prime num");
    }
    else{
                System.out.println(x + "is  not prime num");

    }

}
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
Prime(x);
}
}