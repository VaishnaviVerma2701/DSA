 class j{
void insert(int data,node head,int posi){
    if(posi == 0){
       new.next=head;
       head=new;
    
    int cur= head;
    for(int i=0;i<posi-1;i++){
        cur=cur.next;
    }
    new.next=cut.next;
    cur.next=new;
}
}
void delete(node head,int posi){
    if(head ==null){
        System.out.println("null");
    }
    if(posi == 0){
       head=head.next;
    }

    int cur= head;
    for(int i=0;i<posi-1;i++){
        cur=cur.next;
    }
    cur.next=cur.next.next;
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

psvm(){
  j n=new j();
  j.head= new node(10);
  j.head.next= new node(20);
  j.head.next.next= new node(30);
  j.head.next.nexr.next= new node(40);
  j.head.next.next= head.next

  n.insert(60,head,3);
  n.printlist();
  n.delete(head,3)
  n.printlist();

} 

}