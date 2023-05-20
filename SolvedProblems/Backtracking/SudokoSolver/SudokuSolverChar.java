package SolvedProblems.Backtracking.SudokoSolver;

import java.util.Arrays;

public class SudokuSolverChar {
    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '3', '.', '6', '5', '.', '8', '4', '.', '.' },
                { '5', '2', '.', '.', '.', '.', '.', '.', '.' },
                { '.', '8', '7', '.', '.', '.', '.', '3', '1' },
                { '.', '.', '3', '.', '1', '.', '.', '8', '.' },
                { '9', '.', '.', '8', '6', '3', '.', '.', '5' },
                { '.', '5', '.', '.', '9', '.', '6', '.', '.' },
                { '1', '3', '.', '.', '.', '.', '2', '5', '.' },
                { '.', '.', '.', '.', '.', '.', '.', '7', '4' },
                { '.', '.', '5', '2', '.', '6', '3', '.', '.' }
        };

        solveSudoku(board);
        display(board);
    }

    public static void solveSudoku(char[][] board) {
        solve(board);
    }

    public static boolean solve(char[][] board) {
        int row = -1;
        int col = -1;

        boolean emptySpace = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') {
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
            return true;
        }

        for (char number = '1'; number <= '9'; number++) {
            if (isSafe(board, row, col, number)) {
                board[row][col] = number;
                if (solve(board)) {
                    return true;
                } else {
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public static boolean isSafe(char[][] board, int row, int col, char number) {
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == number) {
                return false;
            }
        }

        for (char[] rows : board) {
            if (rows[col] == number) {
                return false;
            }
        }
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);
        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart + sqrt; j++) {
                if (board[row][col] == number) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void display(char[][] board) {
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }
}
