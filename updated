import java.util.HashSet;
import java.util.Set;

public class SudokuSolver {

    // Method to check if the number is safe to place in the row
    public static boolean isSafeInRow(int[][] board, int row, int num) {
        Set<Integer> seen = new HashSet<>();
        
        // Iterate through each column in the specified row
        for (int i = 0; i < 9; i++) {
            // If a number is already present in the row, add it to the set
            if (board[row][i] != 0) {
                seen.add(board[row][i]);
            }
        }
        
        // Check if the number already exists in the set
        return !seen.contains(num);
    }

    // Main method to test the isSafeInRow method
    public static void main(String[] args) {
        // Sample 9x9 Sudoku board
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        // Test: Check if number 5 can be placed in row 0
        int row = 0;
        int num = 5;
        boolean isSafe = isSafeInRow(board, row, num);

        // Output the result
        if (isSafe) {
            System.out.println("It is safe to place " + num + " in row " + row);
        } else {
            System.out.println("It is NOT safe to place " + num + " in row " + row);
        }
    }
}
