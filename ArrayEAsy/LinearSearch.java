package ArrayEAsy;

public class LinearSearch {

    public static void main(String[] args) {
        // Original array
        int[] arr = {10, 25, 30, 45, 50};

        // Element to search
        int target = 30;

        // Flag to check if element is found
        boolean found = false;

        // Loop through each element of array
        for (int i = 0; i < arr.length; i++) {
            // If current element matches the target
            if (arr[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true; // Mark as found
                break; // No need to search further
            }
        }

        // If element not found
        if (!found) {
            System.out.println("Element " + target + " not found in array.");
        }
    }
}

}
