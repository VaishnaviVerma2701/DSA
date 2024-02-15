
class list {
    ListNode head;
    class ListNode{
        int data;
        ListNode next;
    }
    public ListNode middleNode(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
           temp= temp.next;
        }
        
        // n is length
         temp= head;
        int mid=n/2;
        for(int i=1;i<=mid;i++){
            temp=temp.next;
        }
        return temp;
    }
}

// using two pointer
class list1 {
    ListNode head;
    class ListNode{
        int data;
        ListNode next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}


//detect the loop in linked list
class list2 {
    Node head;
    class Node{
        int data;
        Node next;
    }
    //Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head){
        // Add code here
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            return true;
        }
        return false;
    }}