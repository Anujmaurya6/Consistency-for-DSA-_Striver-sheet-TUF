package ARRAY;
import java.util.*;

public class Stack {
    Queue<Integer> q=new LinkedList<>();

    //push ke liye
    void push(int x){
        q.add(x);
        int size=q.size();
        for(int i=1;i<size;i++){
        q.add(q.remove());
        }
    }

    //pop le liye 
    int pop(){
        if(q.isEmpty()){
            return -1;
        }else{
            return q.remove();
        }
    }

    //ab peek 
    int peek(){
        if(q.isEmpty()){
            return -1;
        }else{
            return q.peek();
        }
    }

        public static void main(String[] args) {
            Stack sb=new Stack();
            sb.push(10);
            sb.push(20);
            System.out.println("the push answer is "+sb.peek());
        }
    }
    
    