package ARRAY;
import java.util.Scanner;

public class Stackcrud {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int []stack=new int[5];//fixed size stack
    int top=-1;//initially empty

    while (true) { 
         System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                //push karunga stack me
                case 1:
                if(top==stack.length-1){
                    System.out.println("stack khali he");
                }else{
                    System.out.println("enter kar value:");
                    int value=sc.nextInt();
                    stack[++top]=value;//++top ka matlab pehle index badha phir value dal
                    System.out.println("pushed into stack"+value);
                }
                break;
                

                //ab me option rakhunga pop ka
                case 2:
             if (top == -1) {
                        System.out.println("Stack Underflow! Nothing to pop");
                    } else {
                        System.out.println(stack[top] + " popped from stack");
                        --top; // --top k matlab pehle index kam kar then pop kar
                    }
                    break;

                    //ab me karunga peek(matlab top ka element hi dekhunga bas)
                    case 3:
                    if(top ==-1){
                        System.out.println("stack is empty");
                    }else{
                        System.out.println("top element is"+stack[top]);
                    }


                    //ab mujhe idahr display kar na he normally bas
                    case 4:
                    if(top==-1){
                        System.out.println("Stack is empty");
                    }else{
                        for(int i=0;i<=top;i++){
                        System.out.println("Stack elements is"+stack[i]+" ");
                        }
                        System.out.println();
                    }
                    break;
                    
                    case 5: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}