import java.util.*;
class pen{
    String color;
    int price;
    String type;
    public void write(){
        System.out.println("pen is writing");
    }
        public void drow(){
        System.out.println("pen is drowing");

        }}
      class opp1{
        public static void main(String[] args) {
            pen p=new pen();
            p.color="blue";
            p.price=200;
            p.type="gel";
p.write();
p.drow();
System.out.println(p.color+" "+" "+p.price+" "+p.type);

pen trymax=new pen();

            trymax.color="black";
            trymax.price=300;
            trymax.type="gel";
trymax.write();
trymax.drow();
System.out.println(trymax.color+" "+" "+trymax.price+" "+trymax.type);

        }
    }


//constroctor

class student1{
    String name;
    int age;
    float hight;
//    student1(){
// System.out.println("this is default constractor");
//     }
    student1(){
name="vaisu";
age=30;
hight=5;
    }
    student1(String n,int a,float f){
name=n;
age=a;;
hight=f;
    }
}

  class  student{
    public static void main(String[] args) {
                student1 st=new student1();
        student1 st1=new student1();
        System.out.println(st1.name+" "+st1.age+" "+st1.hight);
        student1 st2=new student1("nilu",20,4);
        System.out.println(st2.name+" "+st2.age+" "+st2.hight);
    }
 }
