package ARRAY;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    Queue<Integer> mainQueue = new LinkedList<>();
    Queue<Integer> tempQueue = new LinkedList<>();
    
    void push(int x) {
        // Naya element tempQueue mein daalo
        tempQueue.add(x);
        
        // MainQueue ke saare elements tempQueue mein daalo
        while (!mainQueue.isEmpty()) {
            tempQueue.add(mainQueue.remove());
        }
        
        // MainQueue aur tempQueue ko swap karo
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;
        
        System.out.println(x + " stack mein add hua");
    }
    
    int pop() {
        if (mainQueue.isEmpty()) {
            System.out.println("Stack khali hai!");
            return -1;
        }
        int val = mainQueue.remove();
        System.out.println(val + " stack se nikal gaya");
        return val;
    }
    
    int top() {
        if (mainQueue.isEmpty()) {
            System.out.println("Stack khali hai!");
            return -1;
        }
        return mainQueue.peek();
    }
    
    void show() {
        System.out.println("Stack: " + mainQueue);
    }
}

public class  STackusingTWoqQ{
    public static void main(String[] args) {
        STackusingTWoqQ s = new STackusingTWoqQ();
        
        s.push(10);
        s.push(20);
        s.push(30);
        s.show(); // [30, 20, 10]
        
        s.pop(); // 30 nikal
        s.pop(); // 20 nikal
        s.show(); // [10]
        
        s.push(40);
        s.push(50);
        s.show(); // [50, 40, 10]
        
        System.out.println("Upar wala: " + s.top()); // 50
    }
}
    
}
