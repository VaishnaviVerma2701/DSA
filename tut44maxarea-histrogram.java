import java.util.*;
class maxarea{
    int maxArea(int[]a){
        int maxans=0;
        int ps[]=prevSmaller(a);
        int ns[]=nextSmaller(a);
for(int i=0;i<a.length;i++){
    int curr=(ns[i]-ps[i]-1)*a[i];
    maxans=Math.max(maxans,curr);
}
return maxans;
    }
    
    int[] prevSmaller(int[] a){
        int ps[]=new int[a.length];
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<a.length;i++){
            while(!s.isEmpty() &&a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=s.peek();
            }
            s.push(i);
        }
        return ps;
    }

    public int[] nextSmaller(int[]a){
         int ns[]=new int[a.length];
        Stack<Integer>s=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() &&a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ns[i]=-1;
            }
            else{
                ns[i]=s.peek();
            }
            s.push(i);
        }
        return ns;
    }
    public static void main(String[] args) {
        maxarea m=new maxarea();
        int[] a={1,3,2,5,7,4,9};
        System.out.print(m.maxArea(a));
       // System.out.println(m.prevSmaller(a));        
        //System.out.println(m.nextSmaller(a));

    }
}