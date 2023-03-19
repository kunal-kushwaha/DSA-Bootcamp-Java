package SolvedProblems.BinarySearch;

public class CeilingOfNumber {
    public static int findingCeiling(int[] arr, int target) {
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0, end = arr.length;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return arr[mid];
            } else if (arr[0] < arr[arr.length - 1]) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return arr[start];

    }

    public static void main(String[] args) {
        // Smallest number that is greater or equal to target number
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 6;
        System.out.println("Ceiling of the target number " + target + " is " + findingCeiling(arr, target));
    }
}