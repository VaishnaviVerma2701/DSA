import java.net.SocketPermission;

class d21callbyvalue {
    public static void change(int a){
        a=a+10;
        System.out.println(a);
    }
   public static void main(String[] args) {
    int a=20;
    a=24;
    System.out.println("before change="+a);
    change(a);
    System.out.println("after change"+a);

   }
}

class d21callbyreference {
    int b=20;
    public static void change(int a){
        a=a+10;
        System.out.println(a);
    }
   public static void main(String[] args) {
    // d21callbyreference a= new d21callbyreference();
    System.out.println("before change="+b);
    change(b);
    System.out.println("after change"+a.b);

   }
}
