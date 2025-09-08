public class StackusingArray {
int []arr;
int top;
int capacity;

//constructor
    public StackusingArray(int size) {
        arr=new int [size];
        top=-1;
        capacity=size;
    }

    //push karne ke he 
    void push(int x){
     if(top == capacity-1){
        System.out.println("The stack is full");
     }else{
        arr[++top]=x;
        System.out.println("the stack is pushed"+x);
     }
    }

    //pop karna ka he yeh
    int pop(){
        if(top == -1){
        System.out.println("the stack is empty");
        return -1;
        }else{
            return arr[top--];
        }
    }    

    //peek
    int peek(){
        if(top == -1){
            System.out.println("The stack is empty");
            return -1;
        }else{
            int result=arr[top];
            System.out.println("the top elemnt is"+result);
        return result;
    }
}
    public static void main(String[] args) {
        StackusingArray sb=new StackusingArray(20);
        sb.push(20);
        sb.push(50);
        sb.push(90);
        sb.push(22);

        sb.peek();
        sb.peek();
        sb.peek();




        
    }
}
