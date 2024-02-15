//abstraction
//cant create obj
//both method are used abstract ot conflict
//100% abstraction
//abstract method need to define in the child cls

import java.util.*;
abstract class bike{  //abstract class
    abstract public void run(); //abstract method

    public void brake(){
        System.out.println("break are applyed");
    }

}
  class pulser extends bike{
 public void run(){
     System.out.println("pulser is runing");
 }
public static void main(String[] args) {
   // pulser b=new pulser();
   bike b=new pulser();
    b.run();
    b.brake();
}
 }