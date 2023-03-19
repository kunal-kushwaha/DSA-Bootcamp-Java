// https://leetcode.com/problems/find-in-mountain-array/
// I'm trying to solve this problem without using interface
package SolvedProblems.BinarySearch;

public class FindMountainInTheArray {
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[start] < arr[end]) {
                if (arr[mid] < target)
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (arr[mid] < target)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }

    public static int findingPeakIndexInMountainArray(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;

        int peak = findingPeakIndexInMountainArray(arr, 0, arr.length - 1);

        int increasingPart = orderAgnosticBinarySearch(arr, target, 0, peak);
        if (increasingPart != -1) {
            System.out.println("Peek found in the increasing part " + increasingPart);
            return;
        } else {
            int decreasingPart = orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
            if (decreasingPart != -1 && target == arr[decreasingPart])
                System.out.println("Peek found in the decreasing part " + decreasingPart);
            else
                System.out.println("Value not found");
        }
    }
}
