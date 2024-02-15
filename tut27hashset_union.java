import java.util.*;
class union{
        public static int dounion(int a[],int[]b,int n,int m) {
            HashSet<Integer>set=new HashSet<>();
            
            for(int i=0;i<n;i++){
                set.add(a[i]);
            }
             for(int j=0;j<m;j++){
             set.add(b[j]);
            }
            System.out.print(set);
          return set.size();
        

        }  
        public static void main(String[] args) {
            int[]a={1,1,1,2,3,5};
            int[]b={1,2,6};
            int n=a.length;
            int m=b.length;
           int k= dounion(a,b,n,m);
           System.out.println(k);
        }
    }

    class intersection{
        public static int Intersection(int[]a,int[]b,int n,int m){
            HashSet<Integer>set=new HashSet<>();
            int c=0;
            for(int i=0;i<n;i++){
                set.add(a[i]);
            }
            for(int i=0;i<m;i++){
                if(set.contains(b[i])){
                    c++;
                    System.out.print(set.remove(b[i])+" ");
                }
            }
            return c;
        }
        public static void main(String[] args) {
            int[]a={2,3,1,2,4,5};
            int[]b={6,3,1,2,5,6,3};
            int n=a.length;
            int m=b.length;
            System.out.println(Intersection(a,b,n,m));
        }
    }
