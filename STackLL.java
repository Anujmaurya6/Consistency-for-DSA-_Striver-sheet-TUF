package ARRAY;

 class Node{
    int data;
    Node next;
}

public class STackLL {
    static Node top;
     
    //push ka code
    static void push(int x){
    Node newNode=new Node();
    newNode.data=x;
    newNode.next=top;
    top=newNode;
    }

    //pop ka code
    
    static int pop(){
        if(top == null){
            return -1;
        }
        int val=top.data;
         top=top.next;
        
         return val;
        }

        //peek
        static int peek(){
            if(top == null){
                return -1;
            }
            return top.data;
        
    }

        public static void main(String[] args) {
            push(10);
            push(50);
            push(40);
      System.out.println(peek());
      System.out.println(pop());
      System.out.println(peek());
        }

}
