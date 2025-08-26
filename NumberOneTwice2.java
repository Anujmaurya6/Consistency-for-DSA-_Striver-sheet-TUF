
import java.util.HashMap;

public class NumberOneTwice2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5, 5, 6, 6};
        int n = arr.length;

        HashMap<Integer, Integer> freq = new HashMap<>(); // map banaya

        // Step 1: Frequency count
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find element whose frequen cy is 1
        for (int key : freq.keySet()) {
            if (freq.get(key) == 1) {
                System.out.println("Better answer: " + key);
                break;
            }
        }
    }
}
