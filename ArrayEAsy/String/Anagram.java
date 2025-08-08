package ArrayEAsy.String;

    import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Convert both strings to lowercase to ignore case differences
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // Step 1: If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams (different lengths)");
        } else {
            // Step 2: Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Step 3: Sort both char arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Step 4: Compare sorted arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Yes! They are Anagrams.");
            } else {
                System.out.println("No! They are Not Anagrams.");
            }
        }

        sc.close();
    }


}
