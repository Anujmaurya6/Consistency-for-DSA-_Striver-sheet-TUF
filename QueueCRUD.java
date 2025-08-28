package ARRAY;
import java.util.Scanner;

public class QueueCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = new int[5];
        int front = -1;
        int rear = -1;

        while (true) {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue (Insert)");
            System.out.println("2. Dequeue (Delete)");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Enqueue
                    if (rear == queue.length - 1) {
                        System.out.println("Queue Overflow! Cannot insert.");
                    } else {
                        System.out.print("Enter value: ");
                        int value = sc.nextInt();
                        if (front == -1) {
                            front = 0; // first element case
                        }
                        queue[++rear] = value;
                        System.out.println(value + " inserted into queue.");
                    }
                    break;

                case 2: // Dequeue
                    if (front == -1) {
                        System.out.println("Queue Underflow! Nothing to delete.");
                    } else {
                        System.out.println(queue[front] + " removed from queue.");
                        if (front == rear) {
                            front = rear = -1; // queue empty ho gayi
                        } else {
                            ++front;
                        }
                    }
                    break;

                case 3: // Peek
                    if (front == -1) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Front element: " + queue[front]);
                    }
                    break;

                case 4: // Display
                    if (front == -1) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.print("Queue elements: ");
                        for (int i = front; i <= rear; i++) {
                            System.out.print(queue[i] + " ");
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
//queue kuch speucal type ki chiz he jisme hum reverse ya sort jaise kaam nhi kar skte he isliye 