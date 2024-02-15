import java.util.*;
class stack{
    int[]stack=new int[5];
    int top=-1;
   public void  push(int x){
     top++;
stack[top]=x;
if(top==stack.length-1){
    System.out.println("stack in overflow");
}
    }
   public int pop(){
        int popped=stack[top];
         top--;
        //return popped;
        if(top==-1){
            System.out.println("stack is underflow");
        }
        return popped;
        
    }
  public int  peek(){
    //return stack[top];
    if(top==-1){
        System.out.println("can not peek");
    }
    return stack[top];
}
    public void printstack(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
 class stackimplemention{
    public static void main(String[] args) {
       stack st=new stack();
    //    int n=stack.length;

       st.push(3);
       st.push(5);
       st.push(7);
              st.printstack();

       st.pop();
       st.printstack();

System.out.println(st.peek());
       }  
       
    }



    class str{
        int[]stack=new int[5];
    int top=-1;
   public void  push(char x){
     top++;
stack[top]=x;
if(top==stack.length-1){
    System.out.println("stack in overflow");
}
    }
   public void pop(){
       // int popped=stack[top];
        // top--/;
        //return popped;
       
        if(top==-1){
            System.out.println("stack is underflow");
        }
        //return popped;
         System.out.print(stack[top]);
    }
  public int  peek(){
    //return stack[top];
    if(top==-1){
        System.out.println("can not peek");
    }
    return stack[top];
}
    public void printstack1(){
        for(int i=0;i<=top;i++){
            System.out.print(stack[i]+" ");
        }
        System.out.println();
    }
}
 class stackimplemention1{
    public static void main(String[] args) {
       str st=new str();
    //    int n=stack.length;

       st.push('e');
       st.push('f');
       st.push('y');
              st.printstack1();

       st.pop();
    //   st.printstack1();

System.out.println(st.peek());
       }  
       
    }
    


   