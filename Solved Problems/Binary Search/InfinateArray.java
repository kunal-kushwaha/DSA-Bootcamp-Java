
public class InfinateArray {
    static int start = 0, end = 1;

    public static int binarySearch(int[] arr, int target, int start, int end) {
        System.out.println(start + " " + end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    /*
     * We're trying to search the range in which the target lies
     * This can be done by increasing the start and end values
     * from size 2 to 4 to 8 i.e. doubling the range of start and end
     */
    public static int ans(int[] arr, int target) {

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    public static void main(String[] args) {

        /*
         * Considering this array as infinite array
         * This means that we're not allowed to find or the length of arr
         * We don't have to check the boundary conditions for this
         * because anyways the array is going to be infinite array
         * so boundary conditions will not be satisfied in this problem
         */
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int target = 12;

        System.out.println(ans(arr, target));
    }
}