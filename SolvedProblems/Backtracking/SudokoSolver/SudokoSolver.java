package SolvedProblems.Backtracking.SudokoSolver;

import java.util.Arrays;

public class SudokoSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solveSudoku(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    public static boolean solveSudoku(int[][] board) {
        int row = -1;
        int col = -1;

        boolean emptySpace = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    row = i;
                    col = j;
                    emptySpace = false;
                    break;
                }
            }
            if (!emptySpace) {
                break;
            }
        }

        if (emptySpace) {
            // Sudoku solved
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solveSudoku(board)) {
                    return true;
                } else {
                    board[row][col] = 0;
                }
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int row, int col, int number) {
        // Check the row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }

        // Check the column
        for (int[] rows : board) {
            if (rows[col] == number) {
                return false;
            }
        }

        // Check the boxes
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(int[][] board){
        for(int[] row : board){
            System.out.println(Arrays.toString(row));;
        }
    }
}
