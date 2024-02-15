import java.util.*;
class fact{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

class fact1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,res=0;
        for(i=5;i<=n;i=i*5){
            res=res+(n/i);
        }
        System.out.println(res);
    }
}

class factkp{
    public static int  fact1(int x){
        if(x==1){
            return 1;
        }
      return x * fact1(x-1);
    }
    public static void main(String[] args){
        int x=4;
        System.out.println(fact1(x));
    }
}
