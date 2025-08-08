package ArrayEAsy.String;

public class OutermostParenthesis {
    public static void main(String[] args) {
        String input = "(()())";
        
        StringBuilder result = new StringBuilder(); // final answer yeh ayega
        int opencount = 0; // yeh batayega ki kitne '(' abhi open hain
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '(') {
                if (opencount > 0) {
                    result.append(c);
                }
                opencount++;
            } else {
                opencount--;
                if (opencount > 0) {
                    result.append(c);
                }
            }
        }
        
        System.out.println("Original: " + input);
        System.out.println("Modified: " + result.toString());
    }
}