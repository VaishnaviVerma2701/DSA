import java.util.Scanner;
class value {
public static void main(String[] args) {
 int x=2;
int x1=5;
    
float d=x1+x;
    System.out.println(x1++);   
     System.out.println(--x1);
    System.out.println(++x1);
    System.out.println(x1);
    System.out.println(x1++);
    System.out.println(x--);   
     System.out.println(--x);     
     System.out.println(d);

}
}
//while
class loop{
    public static void main(String[] args) {  
int a=0;
while(a<5)
    System.out.println(++a*5);
}
}

class num{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        switch(a){
        case (75):
            System.out.println("des");
            break;
         case (50):   System.out.println("pass");
             break;
         default :
             System.out.println("");
 

        }
        switch(a){
            case (40):
      System.out.println(" ijpass");
      break;

       case 2:
      System.out.println("fail");
      break;
        }
    }
}