import java.util.*;

class arrlist1{
    public static void main(String[] args) {
    ArrayList<Integer>l=new ArrayList<>();
 l.add(9);
 l.add(7);
 l.add(5);
 l.add(4);
 System.out.println(l); //print the element
 System.out.println(l.remove(0));
  System.out.println(l);

   System.out.println(l.size());

    System.out.println(l.isEmpty());
    //using list get the value of 2nd position
    System.out.println(l.get(2));

    //add   2 in 0 position
    l.add(0,2);
    // modify the 1 position
    l.set(1,3);

 System.out.println(l);

}}

// BFS
