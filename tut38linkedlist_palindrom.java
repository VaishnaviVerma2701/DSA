class palindrom{
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
    boolean  Palindrom(Node head){
        if(head==null){
        return true;
        }
        Node mid=middle(head);
        Node last=reverse2(mid.next); 
        Node cur=head;
        while(last!=null) {
            if(last.data!=cur.data)
            return false;
            last=last.next;
            cur=cur.next;
        }
        return true;
}
Node middle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
public static void main(String[] args){
    palindrom p=new palindrom();
    p.head=new Node(9);
    p.head.next=new Node(8);
    p.head.next.next=new Node(7);
    p.head.next.next.next=new Node(6);    
    p.head.next.next.next.next=new Node(7);
    p.head.next.next.next.next.next=new Node(8);
    p.head.next.next.next.next.next.next=new Node(9);
    System.out.println(p.Palindrom(head));
}
}