package ARRAY.INFIXPREFIXPOSTFIX;

import java.util.*;
public class InfixToPrefix {
    
    static int precedence(char ch){
    switch(ch){
        case '+':
        case '-':
        return 1;

        case'*':
        case '/':
        return 2;

        case '^':
        return 3;
    }
    return -1;
}

     static String infixtoPostfix(String infix){
        StringBuilder result=new StringBuilder();

        Stack<Character> stack=new Stack<>();
        
        //traverse from left to right
        for(int i=0;i<infix.length();i++){
            char symbol=infix.charAt(i);
        
        //1.Agar operand matlab symbol  (A-Z,a-z,0-9, )
        if(Character.isLetterOrDigit(symbol)){
            result.append(symbol);
        }

        //2.agar closing ya opening bracket mila then kaise karega
        else if(symbol == '('){
            stack.push(symbol);
        }

        //3.agar closign bracket raha then 
        else if(symbol == ')'){
            while(!stack.isEmpty() && stack.peek() != '('){
               result.append(stack.pop());
            }
            stack.pop();
        }

        //4.agar operator mila then 
   else{
    while(!stack.isEmpty() && precedence(symbol) <= precedence(stack.peek())){
        result.append(stack.pop());
    }
        stack.push(symbol);
    }
   }
        //5 ab idar me bacha hua elemebt ki bhi baat karunga
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
    }

    
    public static void main(String[] args) {
        String infix="(A+B)*(C+D)";        
        String postfix=infixtoPostfix(infix);
             System.out.println("Infix Expression : " + infix);
        System.out.println("Postfix Expression: " + postfix);
    }
    
    
}

