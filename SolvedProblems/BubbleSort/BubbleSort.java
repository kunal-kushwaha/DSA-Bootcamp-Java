package SolvedProblems.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] nums) {
        boolean swap = false;
        for (int i = 0; i <= nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
