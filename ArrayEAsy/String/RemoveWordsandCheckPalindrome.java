
package ArrayEAsy.String;

public class RemoveWordsandCheckPalindrome {
    public static void main(String[] args) {
        // Input string
        String input = "anuj maurya madam racecar";
        
        // Split into words
        String[] words = input.split(" ");
        
        // Check each word individually
        for (String word : words) {
            // Reverse the current word
            String reversed = new StringBuilder(word).reverse().toString();
            
            // Check if palindrome (case insensitive)
            boolean isPalindrome = word.equalsIgnoreCase(reversed);
            
            // Print results for each word
            System.out.println("\nWord: " + word);
            System.out.println("Reversed: " + reversed);
            System.out.println("Palindrome: " + (isPalindrome ? "Yes" : "No"));
        }
    }
}