import java.util.*;
class parent{
int money=500000;
public void drivecar(){
    System.out.println("drive mercend");
}
}
class child extends parent{
public void play(){
    System.out.println("playing footboll");
}
public static void main(String[] args) {
    parent p=new parent();
    child c=new child();
    p.drivecar();
    c.play();
        c.drivecar();
            // p.play();
            System.out.println(p.money);           
             System.out.println(c.money);  
  



}
}
