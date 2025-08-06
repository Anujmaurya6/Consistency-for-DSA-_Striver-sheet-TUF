package ArrayEAsy.arraymedium;

public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        // Matrix ki dimensions nikal rahe hain
        // m = total rows, n = total columns
        int m = matrix.length;
        int n = matrix[0].length;
        
        // Do arrays banaye hain:
        // zeroRows - track karega kaunsi rows mein zero hai
        // zeroCols - track karega kaunsi columns mein zero hai
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];
        
        // Pehla loop: Pure matrix ko scan karo
        // Har cell check karo, agar zero mile to uski row aur column mark karo
        for (int i = 0; i < m; i++) {          // Har row ke liye
            for (int j = 0; j < n; j++) {      // Har column ke liye
                if (matrix[i][j] == 0) {       // Agar cell zero hai to
                    zeroRows[i] = true;         // Us row ko mark karo
                    zeroCols[j] = true;         // Us column ko mark karo
                }
            }
        }
        
        // Dusra loop: Actual matrix ko update karo
        // Har cell check karo, agar uski row ya column marked hai to zero set karo
        for (int i = 0; i < m; i++) {          // Har row ke liye
            for (int j = 0; j < n; j++) {      // Har column ke liye
                if (zeroRows[i] || zeroCols[j]) {  // Agar row ya column marked hai
                    matrix[i][j] = 0;          // Cell ko zero kar do
                }
            }
        }
    }
}
    
