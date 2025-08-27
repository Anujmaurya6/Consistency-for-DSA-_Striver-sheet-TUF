public class REver {

    public static void main(String[] args) {
        // Input string
        String str = "java is awesome";

        // Convert string to char array for in-place modification
        char[] s = str.toCharArray();
        int n = s.length;

        // Step 1: reverse the entire string
        int left = 0, right = n - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        // Now string looks like: "emosewa si avaj"

        // Step 2: reverse each word individually
        int start = 0; // start index of current word
        for (int end = 0; end <= n; end++) { // end goes up to n to include last word
            if (end == n || s[end] == ' ') { // word boundary found
                left = start;
                right = end - 1;
                while (left < right) { // reverse current word
                    char temp = s[left];
                    s[left] = s[right];
                    s[right] = temp;
                    left++;
                    right--;
                }
                start = end + 1; // move start to next word
            }
        }

        // Step 3: convert char array back to String and print
        String result = new String(s);
        System.out.println(result); // Output: "awesome is java"
    }
}
