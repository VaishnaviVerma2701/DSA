//import java.util.*;
class sum{
    static int a,b,c,d;
    public   void set(int a,int b,int d){
this.a=a;
this.b=b;this.d=d;}
public static void sum1(){
int c=a+b;
System.out.println(c);
    }}
    class   Sum1 extends sum{
        public static void sum2(){


int e=c+d;
System.out.println(e);

    }
    public static void main(String[] args){
        sum s=new sum();
        
s.set(3,7,8);
sum1();
sum2();
    }
}