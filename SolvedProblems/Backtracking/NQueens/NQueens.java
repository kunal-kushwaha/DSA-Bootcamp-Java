package SolvedProblems.Backtracking.NQueens;

public class NQueens {
    public static  int placeQueens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        // Checking whether Queen can be placed or not
        // Checking on top only because no queen exist on bottom
        for(int col = 0; col < board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += placeQueens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int row, int col) {
        // Checking in the upside
        for(int i = row - 1; i >= 0; i--){
            if(board[i][col] == true){
                return false;
            }
        }

        // Checking in the left diagnol
        for(int i = 0; i < Math.min(row, col); i++){
            if(board[row - i - 1][col - i - 1] == true){
                return false;
            }
        }

        // Checking in the right diagnol
        for(int i = 0; i < Math.min(row, board.length - col - 1); i++){
            if(board[row - i - 1][col + i + 1] == true){
                return false;
            }
        }

        return true;
    }

    public static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean val : row) {
                if (val == true) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(placeQueens(board, 0));
    }
}
