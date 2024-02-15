import java.util.*;
class valid {
    public static  boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();
           for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(')
            stack.push(')');
            else if(c=='{')
            stack.push('}');
            else if(c=='[')
            stack.push(']');
            else if(stack.isEmpty()||stack.pop()!=c)
            return false;
        }
        return stack.isEmpty();
    }
    public static void main(String[]args){
        String s="()[]{}";
        System.out.println(isValid(s));
    }
}