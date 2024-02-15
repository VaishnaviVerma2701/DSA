import java.util.*;
class sellbuy{
    public static int maxprofit(int[]a){
        int minsofar=a[0];
        int maxprofit=0;
        for(int i=0;i<a.length;i++){
if(minsofar>a[i]){
    minsofar=a[i];
}
int profit=a[i]-minsofar;
if(profit>maxprofit){
    maxprofit=profit;
}
        }
        return maxprofit;

    }
    public static void main(String[] args) {
        int[] a={5,2,6,1,4};
        System.out.print(maxprofit(a));
    }
}