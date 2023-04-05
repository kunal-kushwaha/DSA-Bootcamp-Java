package SolvedProblems.Recursion;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int start, int end) {

        if (start > end || target > arr[arr.length - 1] || target < arr[0]) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            // end = mid - 1; is used in normal case but in recursion we directly pass this
            // inside the function
            return binarySearch(arr, target, start, mid - 1);

        }
        // start = mid + 1; pass it directly into the recursion
        return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 5, 6, 7, 8, 9, 10, 34, 55, 76, 66, 94 };
        int target = 10;
        System.out.println("Target found in the position: " + binarySearch(arr, target, 0, arr.length - 1));

    }
}
