import java.util.*;
public class Stackusing2queue {
    Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();

    //push element
    public void push(int x){
        q1.add(x);
        System.out.println("Pushed"+x);
    }

    //pop
    public int pop(){
        if(q1.isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }

        //transfer all but last element to q2
        while(q1.size()>1){
            q2.add(q1.remove());
        }

        //last element of q1 is top of stack
        int popped=q1.remove();

        //swap two q1 and q2
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;

        return popped;
    }

    //peek
    public int top(){
        if(q1.isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }

        //transfer all but last element to q2
        while(q1.size()>1){
            q2.add(q1.remove());
        }
        int top=q1.remove();
        q2.add(top);

        //swap queue
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;

        return top;
    }
    public static void main(String[] args) {
        Stackusing2queue sb=new Stackusing2queue();
    }
}

