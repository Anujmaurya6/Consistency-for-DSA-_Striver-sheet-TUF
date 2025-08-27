
public class Anagram2 {
    public static boolean isAnagram(String s, String t) {
        // Agar length alag hai to anagram possible hi nahi
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26]; // a-z ke liye

        // Dono strings ko ek saath traverse karo
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++; // s ka letter add
            freq[t.charAt(i) - 'a']--; // t ka letter subtract
        }

        // Agar koi count zero nahi hai, matlab anagram nahi hai
        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("triangle", "integral"));// true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}
