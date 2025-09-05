package ARRAY.INFIXPREFIXPOSTFIX;

import java.util.Stack;

public class PostfixToInfix {
    static String postfixtoInfix(String postfix){
        Stack<String> stack=new Stack<>();

        for(int i=0;i<postfix.length();i++){
            char c=postfix.charAt(i);

            if(Character.isLetterOrDigit(c)){
                stack.push(String.valueOf(c));
            }else{
                String op2=stack.pop();
                String op1=stack.pop();
                String exp="("+op1+c+op2+")";
                stack.push(exp);
            }
        }
         return stack.pop();
    }
    public static void main(String[] args) {
        String postfix="AB+C*";
        String answer=postfixtoInfix(postfix);
        System.out.println("Postfix:"+postfix);
        System.out.println("Infix:"+answer);
        
    }
}
