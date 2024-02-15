import java.util.*;
class cycle1{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public boolean cycle(Node head){
        // if(head==null||head.next==null){
        //     return  ;
            Node slow=head;
            Node fast=head;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                    
                }
                
            }
            return false;
        }
    
    void printlist(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        cycle1 n=new cycle1();
        n.head=new Node(50);
        n.head.next=new Node(40);
        n.head.next.next=new Node(30);
        n.head.next.next.next=new Node(20);

        n.head.next.next.next=head.next;
        System.out.print(n.cycle(head));
        // n.printlist(head);

    }
}
