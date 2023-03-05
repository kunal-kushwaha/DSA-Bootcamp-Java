public class FloorOfTheNumber {
    public static int floorOfNum(int[] arr, int target) {
        if (target < arr[0]) {
            return -1;
        }
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[0] < arr[arr.length - 1]) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return arr[end];

    }

    public static void main(String[] args) {
        // Greatest number that is smallest or equal to the target number
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 15;
        System.out.println("Floor for the target " + target + " is " + floorOfNum(arr, target));
    }
}
