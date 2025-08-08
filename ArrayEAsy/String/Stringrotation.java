package ArrayEAsy.String;

public class Stringrotation {


    // IMPORTANT: Function to check if one string is rotation of another
    public static boolean isRotation(String s1, String s2) {

        // LAME: Agar length alag hai to rotation possible hi nahi
        if (s1.length() != s2.length()) {
            return false;
        }

        // IMPORTANT: Trick - s1 ko apne saath concatenate karo
        // Agar s2 usme as a substring milta hai to wo rotation hai
        String combined = s1 + s1;

        // LAME: contains() se check kar rahe hain
        return combined.contains(s2);
    }

    public static void main(String[] args) {

        // IMPORTANT: Example test cases to verify logic
        System.out.println(isRotation("waterbottle", "erbottlewat")); // true
        System.out.println(isRotation("abcd", "cdab"));               // true
        System.out.println(isRotation("abcd", "acbd"));               // false
        System.out.println(isRotation("aaaa", "aaaa"));               // true
    }
}

}
