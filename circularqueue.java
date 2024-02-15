import java.util.*;
class circular{
    int a[]=new int[4];
    int n=a.length;
    int front=-1;
    int rear=-1;
    public void circularequeue(int n){
        this.n=n;
        
    }
    void enqueue(int data){
        if((rear+1)%n==front)
        return;
if(front==-1)
front=0;
rear=(rear+1)%n;
a[rear]=data;
    }

    int dequeue(){
        if(front==-1){
            System.out.println("eror");
        }
        int result=a[front];
        if(front==rear){
            front=rear=-1;
        }
        else{
            front=(front+1)%n;
        }
        return result;
    }
    void print(){
        for(int i=0;i<=rear;i++){
                System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        circular c=new circular();
        
c.enqueue(6);
c.enqueue(7);
c.enqueue(8);
c.enqueue(9);
c.enqueue(5);
c.print();
System.out.println(c.dequeue());
    }
}