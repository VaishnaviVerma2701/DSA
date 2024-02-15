class Solution {
    public String reverseWords(String s) {
        String [] y= s.split(" ");
        String t="";
        for(int i=0;i<y.length;i++){  
String k="";
for(int j=y[i].length()-1;j>=0;j--){
   k=k+y[i].charAt(j);
}
if(i==y.length-1){
    t=t+k;
}
else{
    t=t+k+" ";
}
}
return t;
    
    }}