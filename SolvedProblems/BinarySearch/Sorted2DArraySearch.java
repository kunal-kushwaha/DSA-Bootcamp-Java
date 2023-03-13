import java.util.Arrays;

public class Sorted2DArraySearch {

    public static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            } else if (matrix[row][mid] < target) {
                colStart = mid + 1;
            } else if (matrix[row][mid] == target) {
                colEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] sorted2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (cols == 1) {
            return new int[] { -1, -1 };
        }

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;

        while (rowStart <= (rowEnd - 1)) {
            int rowMid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[rowMid][colMid] == target) {
                return new int[] { rowMid, colMid };
            } else if (matrix[rowMid][colMid] < target) {
                rowStart = rowMid;
            } else {
                rowEnd = rowMid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows

        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearch(matrix, rowStart, 0, colMid - 1, target);
        }
        if (target >= matrix[rowStart][colMid + 1] && target < matrix[rowStart][cols - 1]) {
            return binarySearch(matrix, rowStart, rowStart + 1, cols - 1, target);
        }
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearch(matrix, rowStart + 1, 0, colMid - 1, target);
        } else {
            return binarySearch(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }
    }

    public static void main(String[] args) {
        // This matrix is sorted
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 }
        };

        int target = 13;
        int[] result = sorted2DArray(matrix, target);

        if (result[0] == -1) {
            System.out.println("Element not found");
            return;
        }
        System.out.println("Element found in the position : " + Arrays.toString(result));
    }
}