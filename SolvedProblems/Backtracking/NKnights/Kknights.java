package SolvedProblems.Backtracking.NKnights;

public class Kknights {
    public static int kKnights(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += kKnights(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // row - 1 col - 2
        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2] == true) {
                return false;
            }
        }
        // row - 2 col - 1
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1] == true) {
                return false;
            }
        }
        // row - 2 col + 1
        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1] == true) {
                return false;
            }
        }
        // row - 1 col + 2
        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("K ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    } 

    public static void main(String[] args) {
        int n = 3 ;
        boolean[][] board = new boolean[n][n];
        System.out.println(kKnights(board, 0));
    }
}
