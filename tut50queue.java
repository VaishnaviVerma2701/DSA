import java.util.LinkedList;
import java.util.*;
import java.util.Stack;

//  https://www.geeksforgeeks.org/queue-interface-java/
class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // add elements to the queue
        queue.add("apple");
        queue.add("banana");
        queue.add("cherry");

        // print the queue
        System.out.println("Queue: " + queue);

        // remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);

        // print the updated queue
        System.out.println("Queue after removal: " + queue);

        // add another element to the queue
        queue.add("date");

        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);

        // print the updated queue
        System.out.println("Queue after peek: " + queue);
    }
}

// tut50
class queueJava {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20); // also used add()--> generate throw exception
        q.offer(30);
        System.out.println(q);
        System.out.println(q.poll()); // also used remove --> generate throw exception
        System.out.println(q.peek()); // also used element() --> generate throw exception
        System.out.println(q.size());
        System.out.println(q.isEmpty());

    }
}