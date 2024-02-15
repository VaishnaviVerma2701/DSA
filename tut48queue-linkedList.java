import java.util.*;
import java.util.LinkedList;
class queue2{
    //    int queue[]=new int[5];
  static  Node front,rear;
    static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }

    void enqueue(int data){
        Node newnode=new Node(data);
        if(front==null){
            front=rear=newnode;
        }
        rear.next=newnode;
        rear=newnode;
    }
    int dequeue(){
        if(front==null){
            System.out.println("error");
        }
        int result=front.data;
        front=front.next;
        return result;
    }
void printqueue(Node front){
        while(front!=null){
            System.out.print(front.data+" ");
            front=front.next;
        }
    }

    public static void main(String[] args) {
        queue2 q=new queue2();
        q.enqueue(7);
        q.enqueue(8);
        q.printqueue(q.front);
        System.out.println();
        System.out.println("remove element is="+q.dequeue());
        

    }
}
class queue1{
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<Integer>();
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