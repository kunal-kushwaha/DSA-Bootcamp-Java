// https://leetcode.com/problems/find-all-duplicates-in-an-array/

package SolvedProblems.CyclicSort;

import java.util.*;

public class FindAllDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
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

        List<Integer> list = new ArrayList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 }; // Sorted version will be 1,2,3,4,7,8,2,3 and returning 2,3
        System.out.println("All duplicates in the array is : " + findDuplicates(arr));
    }
}