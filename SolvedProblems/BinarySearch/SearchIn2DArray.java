import java.util.Arrays;

public class SearchIn2DArray {

    public static int[] searchInMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[] { row, col };
            } else if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        // This matrix is sotred in every row and column
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 80 }
        };
        int target = 37;

        int[] result = searchInMatrix(matrix, target);

        if (result[0] == -1) {
            System.out.println("Element not found");
            return;
        }

        System.out.println("Element found in the position : " + Arrays.toString(result));
    }
}