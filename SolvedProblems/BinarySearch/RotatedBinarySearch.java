// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

public class RotatedBinarySearch {

    public static int findingPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[start] > arr[mid])
                end = mid - 1;
            else // i.e. if (arr[start] < arr[mid])
                start = mid + 1;
        }
        return -1;
    }

    // This is not asked in the leetcode problem but still what if we want to solve
    // this case. This works for both duplicates and not duplicates
    public static int findingPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;

            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Checking if the duplicate number is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start; 
                }

                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;
            } 
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] < arr[end])) {
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 2, 1, 2 };
        /*
         * Other test cases that can be checked
         * 4, 5, 6, 7, 8, 0, 1, 2, 3
         * 2, 3, 4, 5, 0, 1, 1, 2, 2, 2, 2
         * 2, 3, 4, 2
         */

        int target = 6;

        if (arr[0] == target) {
            System.out.println("Index of the target is : " + 0);
            return;
        }

        if (arr[arr.length - 1] == target) {
            System.out.println("Index of the target is : " + (arr.length - 1));
            return;
        }

        if (arr[0] < arr[arr.length - 1]) {
            System.out.println("Index of the target is : " + binarySearch(arr, target, 0, arr.length - 1));
        }

        int pivot = findingPivotWithDuplicates(arr);

        System.out.println("The pivot index is : " + pivot);

        if (arr[pivot] == target)
            System.out.println("Index of the target is : " + pivot);
        else if (target < arr[0])
            System.out.println("Index of the target is : " + binarySearch(arr, target, pivot + 1, arr.length - 1));
        else
            System.out.println("Index of the target is : " + binarySearch(arr, target, 0, pivot - 1));

    }
}
