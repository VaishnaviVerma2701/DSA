import java.util.*;
import java.util.LinkedList;
class MyStack {
Queue<  Integer> q1=new LinkedList<>();
Queue<  Integer> q2=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        q1.add(x);
    }
    
    public int pop() {
        while(q1.size()>1){  //move element from q1 to q2 except last element
           q2.add(q1.remove()); //move element from q1 to q2
        }
        int popped=q1.remove();  //remove last elemnt
        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }
        return popped;
    }
    
    public int peek() {
       while(q1.size()>1){  //move element from q1 to q2 except last element
           q2.add(q1.remove()); //move element from q1 to q2
        } 
        int topped=q1.peek(); //return last element
        q2.add(q1.remove());  // move last element from q1 to q2

         while(!q2.isEmpty()){
            q1.add(q2.remove()); //move element from q2 to q1
        }
        return topped;
    }
    
    public boolean empty() {
        if(q1.isEmpty()){
            return true;
        }
        else 
        return false;
    }
    void ptint(){
        while(!q1.isEmpty()){
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        MyStack m=new MyStack();
        m.push(7);
        m.push(9);
        m.push(11);
        System.out.println(m.peek()+" ");
        m.pop();
         System.out.println(m.peek()+" ");

 m.pop();
         System.out.println(m.peek()+" ");
    }
}

class MyQueue {
Stack<  Integer> s1=new Stack<>();
Stack<  Integer> s2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        s1.add(x);
    }
    
    public int pop() {
        while(s1.size()>1){  //move element from q1 to q2 except last element
           s2.add(s1.pop()); //move element from q1 to q2
        }
        int popped=s1.pop();  //remove last elemnt
        while(!s2.isEmpty()){
            s1.add(s2.pop());
        }
        return popped;
    }
    
    public int peek() {
       while(s1.size()>1){  //move element from q1 to q2 except last element
           s2.add(s1.pop()); //move element from q1 to q2
        } 
        int topped=s1.peek(); //return last element
        s2.add(s1.pop());  // move last element from q1 to q2

         while(!s2.isEmpty()){
            s1.add(s2.pop()); //move element from q2 to q1
        }
        return topped;
    }
    
    public boolean empty() {
        if(s1.isEmpty()){
            return true;
        }
        else 
        return false;
    }
    void ptint(){
        while(!s1.isEmpty()){
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        MyQueue m=new MyQueue();
        m.push(7);
        m.push(9);
        m.push(11);
        System.out.println(m.peek()+" ");
        m.pop();
         System.out.println(m.peek()+" ");
          m.pop();
         System.out.println(m.peek()+" ");
         

    }
}


class monu{
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();
    public void push(int data) {
      while(!q1.isEmpty()){
        q2.add(q1.poll());
      }
      q1.add(data);
      while(!q2.isEmpty()){
        q1.add(q2.poll());
      }
    }
    int pop(){
        return q1.poll();
    }
    int peek(){
       return q1.peek();
    }
    public static void main(String[] args) {
         monu m = new monu();
        m.push(7);
        m.push(9);
        m.push(11);
        System.out.println(m.peek() + " ");
        m.pop();
        System.out.println(m.peek() +" ");

}
}




class MyQueue1{
    Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        public void push(int data){
            s1.add(data);
        }
        int pop(){
            while(!s1.empty()){
                s2.add(s1.pop());
            }
            int ans=s2.pop();
            while(!s2.isEmpty()){
                s1.add(s2.pop());
            }
            return ans;
        }

    public static void main(String[] args) {
        MyQueue1 mq=new MyQueue1();
       mq.push(7);
        mq.push(9);
        mq.push(11);
        System.out.println(mq.pop());
                System.out.println(mq.pop());
        System.out.println(mq.pop());
}
}


