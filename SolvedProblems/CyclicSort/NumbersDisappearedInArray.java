// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
package SolvedProblems.CyclicSort;

import java.util.*;

public class NumbersDisappearedInArray {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length;) {
            int checkIndex = nums[i] - 1;
            if (nums[checkIndex] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[checkIndex];
                nums[checkIndex] = temp;
            } else {
                i++;
            }
        }

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                list.add(i + 1);
            }
        }
        return list;

        // Another easier method to solve this problem but with extra array
        // int[] res = new int[nums.length];

        // for (int num : nums) {
        //     res[num - 1] = num;
        // }

        // LinkedList<Integer> list = new LinkedList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (res[i] != i + 1) {
        //         list.add(i + 1);
        //     }
        // }
        // return list;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println("Missing numbers are: " + findDisappearedNumbers(arr));
    }

}
