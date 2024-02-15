import java.util.Scanner;
class star1{
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=n/2;i>=1;i--){
            for(j=n;j>=i;j--){
          if(j==i+1||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
               }
            }
        System.out.println();
}
        for(i=0;i<=n/2;i++){
            for(j=1;j<=n;j++){
                if(j==i+1||j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
               }

            }
            System.out.println();
        }
    }
}

class star2{
    public static void main(String[] args) {
        int i,j,k;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=1;i<=n;i++){
    for(j=n-1;j>=i;j--){
        System.out.print(" ");
    }
    for(k=1;k<=n;k++){
        System.out.print("*");
    }
          System.out.println();
  
}
    }
}

class star3{
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println((int)Math.pow(11,i));
        }
    }
}