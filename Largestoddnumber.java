public class Largestoddnumber {

    // Method to find largest odd number prefix
    public static String odd(String num) {
        int n = num.length();

        for (int i = n - 1; i >= 0; i--) {
            char c = num.charAt(i);
            // Check if char is odd
            if (c == '1' || c == '3' || c == '5' || c == '7' || c == '9') {
                return num.substring(0, i + 1);  // odd digit mila
            }
        }
        return ""; // agar odd digit nahi mila
    }

    public static void main(String[] args) {
        System.out.println(odd("4206"));       // Output: ""
        System.out.println(odd("35420"));      // Output: "354"
        System.out.println(odd("246813579"));  // Output: "246813579"
        System.out.println(odd("1110"));       // Output: "111"
    }
}
