package ARRAY;
import java.util.Scanner;
public class Linkedlist {
    public static void main(String[] args) {
        // node ka structure banane ke liye inner class
        class Node{
            int data;//data store karega mera yeh
            Node next;//next node ka address store karega yeh mera idhar 
        }
        Scanner sc=new Scanner(System.in);
        Node head=null;

        while (true) { 
              System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at First");
            System.out.println("2. Insert at End");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Traverse");
            System.out.println("6. Search");
            System.out.println("7. Reverse");
            System.out.println("8. Sort");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

        }
    }
}