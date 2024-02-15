import java.util.*;
class hashmap{
    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("india",141);        
        map.put("india",142);
        map.put("china",140);
        map.put("use",33);
        System.out.println(map);
        map.put("pakistan",23);
        System.out.println(map);

        //remove method
        map.remove("pakistan");
        System.out.println(map);

//search method used to (containsKey)
        System.out.println(map.containsKey("india")); //it return either true or false

        if(map.containsKey("india")){
            System.out.println("india is present");
        }

        //size method
        System.out.println(map.size());

        //take the value for key
        System.out.println(map.get("use"));
    }
}

class twosum {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        int k[]=new int[nums.length];

        int j;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            int pair=target-nums[i];//if element is 2 tha pair=11-2
            if(map.containsKey(pair)){
                ans[0]=i;
                ans[1]=map.get(pair);//pair element index
                break;
            }
            else{
                map.put(nums[i],i);//element,index
            }
        }
         
        return ans;
    }
    public static void main(String[] args) {
        int[]nums={3,2,5,9,7};
       int target=11;
        twosum ts=new twosum();
        System.out.print(ts.twoSum(nums,target));
     //   ts.twoSum(nums,12);
    }
}




