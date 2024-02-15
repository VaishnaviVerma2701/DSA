
import java.util.*;
 class d13 {
    
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q= new LinkedList<>();
        int time =0;
        int n = tickets.length;
        //add everyone to queue//
        for( int i=0; i<n; i++){
            q.add(i);
            }
        while(!q.isEmpty()){
            int index = q.remove();
            tickets[index]--;
            time++;
            if(index==k&&tickets[index]==0)
            break;
            if(tickets[index]>0)
            q.add(index);

        }
         return time;


    }

    public static void main(String[] args) {
        d13 d = new d13();
        int[] tickets={0,1,2,4};
        int k=2;
    System.out.println(d.timeRequiredToBuy(tickets,k));
}

}
