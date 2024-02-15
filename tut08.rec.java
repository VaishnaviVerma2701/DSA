import java.util.*;
class power1{
    static int powerof(int n,int m){

        // if we are go to until 0 than
        // if(n==0){
        //     return 1;
        // }

        if(m==0){
            return 1;
        }
        return n* powerof(n,m-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(powerof(n,m));
    }

}
