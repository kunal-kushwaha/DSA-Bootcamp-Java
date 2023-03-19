package SolvedProblems.BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        // Let say I don't know whether it's sorted in ascending (2, 6, 34, 45, 65, 76, 78, 88, 95, 864) or descending order (98, 87, 78, 76, 65, 54, 43, 32, 21)
        int[] arr = {2, 6, 34, 45, 65, 76, 78, 88, 95, 864};
        int target = 78;
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                System.out.println("Target found at the position: " + middle);
                return;
            } else if (isAsc) {
                if (target < arr[middle])
                    end = middle - 1;
                else
                    start = middle + 1;
            } else {
                if (target < arr[middle])
                    start = middle + 1;
                else
                    end = middle - 1;
            }
        }
        System.out.println("Target not found");
    }
}
