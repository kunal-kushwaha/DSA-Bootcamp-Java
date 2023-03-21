package SolvedProblems.CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static int[] findErrorNums(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int checkIndex = nums[i] - 1;
            if (nums[i] != nums[checkIndex]) {
                int temp = nums[i];
                nums[i] = nums[checkIndex];
                nums[checkIndex] = temp;
            } else {
                i++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return new int[] { nums[i], i + 1 };
            }
        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 }; // 2,3
        System.out.println("The number repeated and missing are : " + Arrays.toString(findErrorNums(arr)));
    }
}