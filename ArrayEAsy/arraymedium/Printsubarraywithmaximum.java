package ArrayEAsy.arraymedium;

public class Printsubarraywithmaximum {


    // Function to find the maximum sum of a contiguous subarray and also print the subarray
    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        int start = 0;       // max sum subarray ka actual start index
        int end = 0;         // usi subarray ka end index
        int tempStart = 0;   // current subarray kab se suru ho rha he ,track karta he

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            currentSum += num;

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart; //final subarray ka start
                end = i;//final subarray ka end
            }

            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1; // next index could start ka new subarray
            }
        }

       //sab kuch print ho uske liye code
        System.out.print("Subarray with Max Sum: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {4, -1, 2, -1, 3, 4, -5, 1, 2};

        int result = maxSubArraySum(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    
}
}
