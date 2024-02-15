import java.util.*;
class modulo{
    public static int fastPower(int a,int b) {
        int res=1;
        while(b>0){
            //if b is odd
            if((b&1)!=0){
                res=res*a;
            }
            a=a*a;
            b=b>>1; //b=b/2
            //b=1<<b //b*2
        }
        return  res;
    }

    public static int fastPower1(int a,int b) {
        int res=1;
        while(b>0){
            //if b is odd
            
                res=res*a;

                b--;
           
        }
        return  res;
    }

    public static long fastPower1(long a,long b,int n) {
        long res=1;
        while(b>0){
            if((b&1)!=0){
                res=((res*a) % n)%n;// (a*b)%n=a%n*b%n;
            }
            a=(a%n*a%n)%n;
            b=b>>1;
        }
        return  res;
    }

public static void main(String[] args) {
    
    System.out.println(fastPower(3,5));    
    System.out.println(fastPower1(3,10));  
  
      System.out.println(fastPower1(3,5,7));

}}