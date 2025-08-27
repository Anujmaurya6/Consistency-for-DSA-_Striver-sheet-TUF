import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        // Convert to same case for case-insensitive comparison
        s = s.toLowerCase();
        t = t.toLowerCase();

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        int i = 0, j = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] != s2[j]) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "Silent")); // true
        System.out.println(isAnagram("rat", "car"));       // false
    }
}
