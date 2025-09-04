public class REverseWor {

    // Reverse the words in a string
    public static String reverseWords(String s){
        String[] words =s.trim().split("\\s+");
        StringBuilder sb=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
            return sb.toString();
    
    }

    public static boolean isPalindrome(String s){
        s=s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left=0;
        int right=s.length()-1;
        
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }

  public static void main(String[] args){
        String s = "madam in eden im adam";

        // Reverse words in the string
        System.out.println("Reversed Words: " + reverseWords(s));

        // Check if the string is a palindrome
        System.out.println("Is Palindrome: " + isPalindrome(s));
    }
}
