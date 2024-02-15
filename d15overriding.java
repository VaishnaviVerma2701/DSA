import java.util.*;

// Method Overriding(runtime method)
//same method name
//same argument
//defferent  class

class add{
    public void sum(int a,int b){
        System.out.println("sum of a+b="+(a+b));
    }  
}
class add1 extends add {
    public void sum(int a,int b){
        super.sum(4,6);
        System.out.println("sum of a+b="+(a+b));
    }
    public static void main(String[] args) {
        add1 s = new add1();
        s.sum(2,6);
    }
}

class drive{
    public void dreivecar(){
        System.out.println("dreive m");
    }
}

class drive1 extends drive{
    public void drivecar(){
        System.out.println("dreive a");
    }
    public static void main(String[] args) {
        drive1 d=new drive1();
        d.drivecar();
    }
}