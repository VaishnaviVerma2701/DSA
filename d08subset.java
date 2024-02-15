import java.util.*;

//all subset of string
class subset{
static  void powerset(String s,int index,String ans){
if(index==s.length()){
    System.out.print(ans+" ");
    return;
}
powerset(s,index+1,ans+s.charAt(index)); //this print left side of tree
powerset(s,index+1,ans);  //this print  rigth side of tree

}
    public static void main(String[] args) {
    String s="123";
     String ans="";
   int  index=0;
    powerset(s,index,ans);
   }
}

//sum of digit
class sum{
    public static int sum1(int n){
        if(n==0){ //base case
return 0;
        }
        return n%10 + sum1(n/10);//recurention relation
    }
    public static void main(String[] args) {
        int n=1235;
System.out.println(sum1(n));
    }
}