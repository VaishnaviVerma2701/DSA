import java.util.*;
class reverse{
   static  Node head;
   Node pre;
   static class Node{
        int data; // This variable stores the data for the current node.
        Node next; // This variable is a reference to the next node in the linked list.
        Node(int data){
            this.data=data;// Constructor: Initialize the data of the node with the provided value.
            this.next = null;  // Initialize the 'next' reference to null, as this node is initially not connected to any other node.
        
        }
}
public Node reverse1(Node head) {
if(head==null){
    return head;
}
Node pre=null;
Node curr=head;
while(curr!=null){
    Node n=curr.next;// Store the next node
    curr.next = pre;     // Reverse the current node
    pre = curr;          // Move prev to the current node
    curr=n;// Move to the next node
}
return pre;
    }
void printlist(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public static void main(String[] args){
        reverse r=new reverse();
        r.head=new Node(5);        
        r.head.next=new Node(7);
                r.head.next.next=new Node(9);
              head=  r.reverse1(head);
                r.printlist(head);
    }
}

class reverse1{
   static  Node head;
   static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
public Node reverse2(Node head) {
if(head==null||head.next==null){
    return head;
}
Node newhead=reverse2(head.next);
// Node headnext=head.next;
  head.next.next=head;
head.next=null;
return newhead;
}
 void printlist(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
public static void main(String[] args){
    reverse1 r=new reverse1();
    r.head=new Node(8);    
    r.head.next=new Node(7);
    r.head.next.next=new Node(6);
    head=  r.reverse2(head);
                r.printlist(head);

}
}
