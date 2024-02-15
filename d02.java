import java.util.Scanner;
class arr{
    public static void main(String[] args) {
        int[]a=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
System.out.println("inter the num");
for(i=0;i<5;i++){
    a[i]=sc.nextInt();
}
for(i=4;i>=0;i--){
    System.out.print(a[i]+" ");
}
    }
}

class arr1{
    public static void main(String[] args) {
    
               int a[] ={5,4,6,1,2,3};
               // int[]a=new int[6];
        int i,temp;
        Scanner sc=new Scanner(System.in);
System.out.println("inter the num");
// for(i=0;i<6;i++){
//     a[i]=sc.nextInt();
// }
for(i=0;i<6;i++){
    if((i==0||a[i]>a[i-1])&&(i==6-1||a[i]>a[i+1])){
        System.out.println(a[i]);
    }
}

}
}

class arr2{
   
    public static void main(String[] args) {
        int[][]a=new int[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);
System.out.println("inter the num");
for(i=0;i<a.length;i=i++){
    for(j=0;j<a.length;j++){
    a[i][j]=sc.nextInt();
}
}
for(i=0;i<a.length;i=i+2){
for(j=0;j<a.length;j++){
System.out.println(j);
}}
for(i=1;i<a.length;i=i+2){
for(j=0;j<a.length;j++){
System.out.println(j);
}}
    }
}
