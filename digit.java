import java.util.*;
//PRINT N TO 1
class digit{
    public static void printdigit(int n){
        if(n>0){
            System.out.println(n);
          printdigit (n-1);
        }
return ; 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printdigit(n);
        
    }
}
//print 1 to N
class digit1{
    public static void printdigit(int N,int n){
        if(n<=N){
            System.out.println(n);
            n++;
            printdigit(N,n);
         }
         }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int n=1;
        printdigit(N,n); 
    }
}