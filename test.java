 class test {
   public static int numnum(int n1,int n2){
    int temp;
    if(n1<n2){
 temp=n1;
 n1=n2;
 n2=temp;
    }
    if(n2==0){
        return n1;
    }
        if(n2!=0){
            int t=n1-n2;
            n1=n2;
            n2=t;}
            
   } 
   public static void main(String[] args) {
    int n1=3,n2=7;
    System.out.println(numnum(n1,n2));
   }
}
