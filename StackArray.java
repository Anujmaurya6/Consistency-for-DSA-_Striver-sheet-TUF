public class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class StackLinkedList {
    Node top;

    void push(int x) {
        Node newNode = new Node(x);
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        return val;
    }

    int peek() {
        if (top == null) return -1;
        return top.data;
    }
}

public class StackArray {
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.peek()); // 30
        System.out.println(s.pop());  // 30
        System.out.println(s.peek()); // 20
    }
}

