package SolvedProblems.CyclicSort;

import java.util.Arrays;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int checkIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[checkIndex]) {
                int temp = nums[i];
                nums[i] = nums[checkIndex];
                nums[checkIndex] = temp;
            } else {
                i++;
            }
        }

        System.out.println("Sorted array is " + Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return nums.length - 1;
    }

    public static void main(String[] args) {
        // 7,8,9,11,12 // 1 is the ans
        int[] arr = { 3, 4, -1, 1 }; // 2 is the ans
        System.out.println("The first missing number is : " + firstMissingPositive(arr));
    }
}
