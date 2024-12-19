public class accessmodifier {
    public void print(){
  System.out.println("vaishnavi");
    }
}
 class accessmodifier1 {
    public static void main(String[] args) {
    accessmodifier a=new accessmodifier();
    a.print();
}
}

// same class are used in 
class num{
    private int num1=34;
    public void sum(){
        System.out.println(num1);
    }
    public static void main(String[] args) {
        num n = new num();
        n.sum();
        System.out.println(n.num1);  
}
}

class num1{
    private int number=34;
    public void sum(){
        System.out.println(number);
    }
}
class num2
{   public static void main(String[] args) {
        num1 n = new num1();
        n.sum();
        //System.out.println(n.number); // show the error   
}
}


class protect{
    protected int k=67;
    protected void print(){
        System.out.println("vaishnavi");
    }
    public static void main(String[] args) {
        protect p=new protect();
        p.print();
        System.out.println(p.k);
        }
}
//different class used protected method and attribute
class protect1{
    public static void main(String[] args) {
    protect p=new protect();
    p.print();
    System.out.println(p.k);
    }
}

class def{
    int s=8;
    void print(){
        System.out.println("vaishnai");
    }
    public static void main(String[] args) {
    def p=new def();
        p.print();
        System.out.println(p.s);
        }

}
class def1{
    public static void main(String[] args) {
    def p=new def();
    p.print();
    System.out.println(p.s);
    }
}