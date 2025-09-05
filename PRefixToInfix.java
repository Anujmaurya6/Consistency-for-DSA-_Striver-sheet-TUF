package ARRAY.INFIXPREFIXPOSTFIX;

import java.util.Stack;

public class PRefixToInfix {
    public static String prefixtoinfix(String prefix){
       Stack<String> stack=new Stack<>();

        for(int i=prefix.length()-1;i>=0;i--){
            char c=prefix.charAt(i);

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
        String prefix= "*+AB-CD"; 
        String answer=prefixtoinfix(prefix);
        System.out.println("Prfix:"+prefix);
        System.out.println("Infix:"+answer);
        
    }
}    

