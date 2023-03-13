public class BinarySearch {
    public static void main(String[] args) {
        // Binary search for values sorted in ascending order eg:98,87,76,65,54,43,32,21
        int arr[] = { 2, 6, 34, 45, 65, 76, 88, 95, 864 };
        int target = 32;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == arr[middle]) {
                System.out.println("Target found at the position: " + middle);
                return;
            }
            // target > arr[middle] for descending order
            else if (target > arr[middle])
                end = middle - 1;
            else
                start = middle + 1;
        }
        System.out.println("Target not found in the array");
    }
}