package ArrayEAsy.arraymedium;

import java.util.Scanner;

public class Nextpermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter space-separated numbers: ");
        String[] input = sc.nextLine().trim().split(" ");
        int[] nums = new int[input.length];

        // Convert input to integer array
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int n = nums.length;
        int i = n - 2;

        // Step 1: Find the first index from end where nums[i] < nums[i+1]
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            // Step 2: Find index j to swap with i
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }

            // Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 3: Reverse the part from i+1 to end
        int start = i + 1;
        int end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

        // Output the result
        System.out.print("Next Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}













}
