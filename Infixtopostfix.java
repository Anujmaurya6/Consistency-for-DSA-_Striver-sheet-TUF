import java.util.*;

public class InfixToPrefix {
    
    // precedence of operators
    static int precedence(char ch) {
        switch(ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;  // highest precedence
        }
        return -1;
    }

    // function to convert infix to prefix
    static String infixToPrefix(String infix) {
        // ✅ Step 1: Reverse infix & swap brackets
        StringBuilder rev = new StringBuilder(infix).reverse();
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) == '(') {
                rev.setCharAt(i, ')');
            } else if (rev.charAt(i) == ')') {
                rev.setCharAt(i, '(');
            }
        }

        // ✅ Step 2: Apply infix → postfix logic on this reversed string
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < rev.length(); i++) {
            char symbol = rev.charAt(i);

            // operand → directly add to result
            if (Character.isLetterOrDigit(symbol)) {
                result.append(symbol);
            }
            // opening bracket
            else if (symbol == '(') {
                stack.push(symbol);
            }
            // closing bracket
            else if (symbol == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // remove '('
            }
            // operator
            else {
                while (!stack.isEmpty() && 
                      (precedence(symbol) < precedence(stack.peek()) ||
                      (precedence(symbol) == precedence(stack.peek()) && symbol != '^'))) {
                    result.append(stack.pop());
                }
                stack.push(symbol);
            }
        }

        // ✅ Step 3: Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // ✅ Step 4: Reverse result to get prefix
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String infix = "(A+B)*(C+D)";
        String prefix = infixToPrefix(infix);

        System.out.println("Infix  : " + infix);
        System.out.println("Prefix : " + prefix); // Output: *+AB+CD
    }
}

    




