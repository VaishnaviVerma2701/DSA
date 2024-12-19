 
 import java.util.*;
import java.util.LinkedList;

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

    class queue1{
        public static void main(String[] args) {
            Queue<Integer>q=new LinkedList<>();
            q.add(4);       
             q.add(6);
            q.add(7);
            q.add(9);
            q.add(45);
            System.out.println(q);
    
            System.out.println("remove element is ="+q.remove());
            System.out.println(q);
    
            System.out.println("peek element ="+q.peek());
    
             System.out.println("size of queue ="+q.size());
    
        }
    }