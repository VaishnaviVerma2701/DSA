import java.util.Scanner;
class fuct{
int x=5;
void sum(int a,int b){
int c=a+b;
System.out.println(c);
}

void fuct1(int n){
    int i ,fact=1;;
    for(i=1;i<=n;i++){
        fact=fact*i;
    }
System.out.println(fact);
fact--;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   fuct r=new fuct();
   r.sum(sc.nextInt(),sc.nextInt());
   r.fuct1(sc.nextInt()); 
   r.fuct1(sc.nextInt());   
   r.fuct1(sc.nextInt());
   r.fuct1(sc.nextInt());

}
}