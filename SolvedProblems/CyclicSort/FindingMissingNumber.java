
package SolvedProblems.CyclicSort;

public class FindingMissingNumber {
    public static int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int checkIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[checkIndex]) {
                int temp = nums[i];
                nums[i] = nums[checkIndex];
                nums[checkIndex] = temp;
            } else {
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;

        // Another easiest way to solve this problem

        // int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum = sum + nums[i] - i;
        // }
        // return nums.length - sum;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 0, 1 };
        System.out.println("Missing number is :" + missingNumber(nums));
    }
}
