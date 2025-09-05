package ARRAY.INFIXPREFIXPOSTFIX;

import java.util.*;  // ✅ Spelling correct

public class PostfixTOprefix {
    
    public static String postfixtoprefix(String postfix) {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));  // ✅ Value pass karo
            } else {
                String opt2 = stack.pop();  // ✅ Pehle pop wala second operand hai
                String opt1 = stack.pop();  // ✅ Dusra pop wala first operand hai
                String exp = c + opt1 + opt2;  // Operator + Operand1 + Operand2
                stack.push(exp);
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "AB+C*";
        String prefix = postfixtoprefix(postfix);  // ✅ Function name match karo
        System.out.println("Postfix: " + postfix);
        System.out.println("Prefix: " + prefix);  // Output: *+ABC
    }
}