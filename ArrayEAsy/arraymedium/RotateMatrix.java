package ArrayEAsy.arraymedium;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        int n = matrix.length; // Matrix ka size (n x n)
        
   
        
        // STEP 1: Transpose - Row ko Column banado
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap karo matrix[i][j] aur matrix[j][i] ko
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // STEP 2: Har row ko reverse karo
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                // Swap karo matrix[i][j] aur matrix[i][n-1-j] ko
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }

    // ✅ OUTPUT KE LIYE MAIN METHOD ADD KARO
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix); // Print original matrix

        RotateMatrix rotator = new RotateMatrix();
        rotator.rotate(matrix); // Matrix rotate karo

        System.out.println("\nRotated Matrix (90° Clockwise):");
        printMatrix(matrix); // Print rotated matrix
    }

    // Matrix print karne ka helper method
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}