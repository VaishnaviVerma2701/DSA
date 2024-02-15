import java.util.*;
class srt{
   static  boolean ispali(String s,int i,int j){
    if(i>=j)
        return true;
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
return ispali(s,i+1,j-1); 
   }
   public static void main(String[] args) {
    String s="101";
   int  i=0;
    int j=s.length()-1;
    System.out.print(ispali(s,i,j));
   }
}


class srt1{
static  void power(String s,int i,String cur){
if(i==s.length()){
    System.out.print(cur+" ");
    return;
}
power(s,i+1,cur+s.charAt(i));
power(s,i+1,cur);

}

    public static void main(String[] args) {
    String s="ram";
     String cur="";
   int  i=0;
    power(s,i,cur);
   }
}

class str2{
   static void parmotation(String s,int l,int r){
        if(l==r){
            System.out.print(s+" ");
            return;
        }
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            parmotation(s,l+1,r);
            s=swap(s,l,i);
        }
    }

  static   String swap(String s,int i,int j){
char temp;
char[] c=s.toCharArray();
temp=c[i];
c[i]=c[j];
c[j]=temp;

return String.valueOf(c);
    }
    public static void main(String[] args){
String s="abc";
int l=0;
int r=s.length()-1;
   
parmotation(s,l,r);
    }
}