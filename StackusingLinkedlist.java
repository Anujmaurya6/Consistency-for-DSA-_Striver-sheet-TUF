public class StackusingLinkedlist {
    
    //node class 
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    private Node top;

    //constructor
    public StackusingLinkedlist (){
        top=null;
    }

    //push ka code
    public void push(int z){
        Node newNode=new Node(z);
        newNode.next=top;
        top=newNode;
        System.out.println(z+"pushed");
    }

        //peek
        public int peek(){
        if(top == null){
            System.out.println("The stack is empty");
            return -1;
        }else{
          return top.data;
        }
    }

    //pop 
    public int pop(){
        if(top == null){
            System.out.println("The stack is empty");
            return -1;
        }else{
            int val=top.data;
            top=top.next;
            return val;
        }
    }
    public static void main(String[] args) {
        StackusingLinkedlist sb=new StackusingLinkedlist();
        sb.push(18);
        sb.push(19);
        sb.push(20);

            System.out.println("Top: " + sb.peek());
        
    }
    
}
