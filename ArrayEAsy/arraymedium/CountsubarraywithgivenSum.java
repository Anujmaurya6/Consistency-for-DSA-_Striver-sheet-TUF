package ArrayEAsy.arraymedium;

import java.util.HashMap;

public class CountsubarraywithgivenSum {
    public static void main(String[] args) {
        // Example usage
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println("Number of subarrays: " + subarraySum(nums, k)); // Output: 2
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0; // Stores the count of valid subarrays
        int sum = 0;   // Running sum (prefix sum)
        
        // Map to store prefix sums and their occurrence counts
        // Key: prefix sum, Value: how many times it's appeared
        HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
        // Base case: empty subarray has sum 0
        prefixSumMap.put(0, 1);
        
        for (int num : nums) {
            // Update the running sum
            sum += num;
            
            // If (sum - k) exists in map, it means there are subarrays ending here that sum to k
            if (prefixSumMap.containsKey(sum - k)) {
                count += prefixSumMap.get(sum - k);
            }
            
            // Record this prefix sum in the map
            prefixSumMap.put(sum, prefixSumMap.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}