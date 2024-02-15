import java.util.*;
// if queue is minimum
class pq{
    public static void main(String[] args) {
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        //add
        pq.add(5);
        pq.add(7);
        pq.add(9);

//print queue
        System.out.println(pq);
        //remove the element
        System.out.println(pq.remove());
        System.out.println(pq);

        //peek
         System.out.println(pq.peek());

    }
}
// if queue is maximu
class pq1{
    public static void main(String[] args) {
        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        //add
        pq.add(5);
        pq.add(7);
        pq.add(9);

//print queue
        System.out.println(pq);
        //remove the element
        System.out.println(pq.remove());
        System.out.println(pq);

        //peek
         System.out.println(pq.peek());

    }
}

