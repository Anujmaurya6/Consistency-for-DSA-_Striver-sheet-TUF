import java.util.*;

public class Isomorphic {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < sArr.length; i++) {
            char cs = sArr[i];
            char ct = tArr[i];

            if (mapST.containsKey(cs) && mapST.get(cs) != ct) return false;
            if (mapTS.containsKey(ct) && mapTS.get(ct) != cs) return false;

            mapST.put(cs, ct);
            mapTS.put(ct, cs);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));   // true
        System.out.println(isIsomorphic("foo", "bar"));   // false
        System.out.println(isIsomorphic("paper", "title"));// true
    }
}

