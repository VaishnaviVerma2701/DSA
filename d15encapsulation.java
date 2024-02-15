import java.util.*;
class account{
     private int balance=4000;

     //getter method;
     public int getbalance(){
        return balance;
     }

     //setter mettod
     public void setbalance(int amount){
        balance=balance+amount;
     }
}
 class bank{
    public static void main(String[] args) {
        account a=new account();
        System.out.println(a.getbalance());

        a.setbalance(5000);
                System.out.println(a.getbalance());

    }
 }