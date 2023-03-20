package SolvedProblems.CyclicSort;

public class FindingDuplicate {
    public static int findDuplicate(int[] nums) {
    // We'll check if duplicates occur before swapping itself
    for (int i = 0; i < nums.length;) {
        if (nums[i] != i + 1) {
            int checkIndex = nums[i] - 1;
            if (nums[i] != nums[checkIndex]) {
                int temp = nums[i];
                nums[i] = nums[checkIndex];
                nums[checkIndex] = temp;
            } else {
                return nums[i];
            }
        } else {
            i++;
        }
    }
    return -1;

    // Second method that runs the cyclic sort completly and returns the last index
    // for(int i = 0; i < nums.length; ){
    //     int checkIndex = nums[i] - 1;
    //     if(nums[i] != nums[checkIndex]){
    //         int temp = nums[i];
    //         nums[i] = nums[checkIndex];
    //         nums[checkIndex] = temp;
    //     }
    //     else{
    //         i++;
    //     }
    // }
    // return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};    // 2 is the answer
        System.out.println("Duplicate number is: " + findDuplicate(arr));
    }
}
