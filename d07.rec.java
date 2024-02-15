import java.util.*;
class Sumof{
    static int sumof(int n){
        //we are go to until i;
        if(n==1){  //base case
            return 1;
        }
        // if we are go to until 0 than
        // if(n==0){
        //     return 0;
        // }
        return n + sumof(n-1); //recurention relation
    }
    public static void main(String[] args) {
        int n=8;
        System.out.print(sumof(n));
    }
}

class fact1{
    static int factof(int n){

        // if we are go to until 0 than
        // if(n==0){
        //     return 1;
        // }

        if(n==1){
            return 1;
        }
        return n * factof(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(factof(n));
    }

}


// fibonacci number
class fibo{
    static int fibonacci(int n){
    if(n==0){ //base case
        return 0;
    }
     else if(n==1){  //base case
        return 1;
    }

    //OR
    // if(n==0||n==1){
      //  return n;
  //  }

    return fibonacci(n-1)+fibonacci(n-2);}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.print(fibonacci(n));
    }
}


class fact2{
    static int factof(int n,int m){

        // if we are go to until 0 than
        // if(n==0){
        //     return 1;
        // }

        if(m==0){
            return 1;
        }
        return n * factof(n,m-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(factof(n,m));
    }

}

