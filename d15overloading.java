import java.util.*;

// Method Overloading
//same class
//same method name
//different argument

class calculator{
     public void addition(String a,int b){     //defferent type of argument
        System.out.println("addition of a+b="+(a+b));
    }
    public void addition(int a,int b){
        System.out.println("addition of a+b="+(a+b));  //a,b
    }
    public void addition(int a,int b,int c){
        System.out.println("addition of a+b+c="+(a+b+c)); // a,b,c
    }

     public void addition(int a,String b){   //diferent sequence 
        System.out.println("addition of a+b="+(a+b));
    }
    public static void main(String[] args) {
        calculator c=new calculator();
        c.addition("hello",34);  
        c.addition(5,7);
        c.addition(5,7,9);
        c.addition(45,"nisha");

    }
}