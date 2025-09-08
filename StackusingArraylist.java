import java.util.*;
public class StackusingArraylist {
    ArrayList<Integer> stack=new ArrayList<>();

    //push 
    public void push(int x){
        if(stack.isEmpty()){
           System.out.println("The stack is empty");
        }else{
            stack.add(x);
        }
    }
    //pop
    public int pop(){
        if(stack.isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }
         else{
           return stack.remove(stack.size()-1);
         }
    }
    //peek
    public int peek(){
        if(stack.isEmpty()){
            System.out.println("the stack is empty");
            return -1;
        }else{
            return stack.get(stack.size()-1);
        }
    }
    public static void main(String[] args) {
        StackusingArraylist sb=new StackusingArraylist();
         sb.push(13);
    sb.push(15);
    sb.push(18);
    
    System.out.println("Popped: " + sb.pop());
    System.out.println("Top element: " + sb.peek());
        
    }


}
