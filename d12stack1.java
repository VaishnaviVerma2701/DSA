 
 import java.util.*;
 class stack1{
        public static void main(String[] args) {
            Stack<Integer>st1=new Stack<>();
            st1.push(3);
            st1.push(5);           
             st1.push(7);
             System.out.println(st1);
             st1.pop();
            System.out.println(st1);
            System.out.println(st1.peek());
// size
System.out.println(st1.size());
//empty
System.out.println(st1.isEmpty());

        }
    }

    