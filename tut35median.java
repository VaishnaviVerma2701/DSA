import java.util.*;
class median{
        PriorityQueue<Integer>max= new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>min= new PriorityQueue<>();

        public void insert(int num){
            if(max.isEmpty()||max.peek()>=num){
                max.add(num);
            }
            else{
                min.add(num);
            }
            if(max.size()>min.size()+1){
                min.add(max.remove());
            }
           else if(max.size()<min.size()){
                max.add(min.remove());
            }
        }

        public double findmedian(){
            if(max.size()==min.size()){
                return max.peek()/2.0+min.peek()/2.0;
            }
            return max.peek();
        }
        public static void main(String[] args) {
            median m=new median();
            m.insert(7);
            m.insert(1);
            System.out.println(m.findmedian());
        }
}

