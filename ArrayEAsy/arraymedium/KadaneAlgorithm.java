package ArrayEAsy.arraymedium;

public class KadaneAlgorithm {

    // Function to find the maximum sum of a contiguous subarray
    public static int maxSubArraySum(int[] arr) {
        // Initialize maxSum to the lowest possible value
        int maxSum = Integer.MIN_VALUE;

        // currentSum will store the ongoing subarray sum
        int currentSum = 0;

        // Traverse through each element of the array
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i]; // current element

            // Add current element to the current sum
            currentSum = currentSum + num;

            // Update maxSum if currentSum is greater than maxSum so far
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If currentSum becomes negative, reset it to 0
            // Because a negative sum will reduce future total
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Return the maximum subarray sum found
        return maxSum;
    }

    // Driver code to test the algorithm
    public static void main(String[] args) {
        // Sample input array with positive and negative numbers
        int[] arr = {4, -1, 2, -1, 3, 4, -5, 1, 2};

        // Call the function and print result
        int result = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

