package ArrayEAsy.arraymedium;

import java.util.*;

public class MatrixSpiral {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        List<Integer> result = new ArrayList<>(); // list to store spiral order result
        
        // initialize the boundary pointers
        int top = 0; // topmost row
        int bottom = matrix.length - 1; // bottom most row
        int left = 0; // leftmost column
        int right = matrix[0].length - 1; // rightmost column

        while (top <= bottom && left <= right) {
            // traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            // traverse from top to bottom (right column)
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            
            if (top <= bottom) { // check if there are rows remaining
                // traverse from right to left (bottom row)
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if (left <= right) { // check if there are columns remaining
                // traverse from bottom to top (left column)
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println("Spiral order is " + result);
    }
}