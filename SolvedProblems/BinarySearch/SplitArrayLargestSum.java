package SolvedProblems.BinarySearch;

public class SplitArrayLargestSum {

    public static int sumArray(int[] nums, int k) {

        int start = 0;
        int end = 0;

        // We're trying to find the range in which the answer lies
        for (int num : nums) {
            // Start holds the minimum answer possible i.e max in the array
            start = Math.max(start, num);
            // End holds the maximum answer possible i.e. sum of the values array
            end += num;
        }

        // If k == nums.length - 1 then the answer will be the the max
        // number in the nums array and start holds it.
        if (k == nums.length) {
            return start;
        }

        // If k == 1 then the answer will be the sum of all the numbers
        // in the nums array and end holds it.
        if (k == 1) {
            return end;
        }

        // Applying binary search between the range of potential answer
        while (start < end) {
            int mid = start + (end - start) / 2;

            // Pieces is going to calculate how many possible subarrays can be made within
            // the mid value
            int pieces = 1;
            // This sum will hold the sum of a sub array and checks with the mid value
            int sum = 0;

            for (int num : nums) {
                if (sum + num > mid) {
                    // If this thing becomes true then we know that the values
                    // before this iteration is a subarray with this mid value
                    // So we can change the sum and pieces
                    // Increment pieces because till the previous value it's a sub array within the
                    // mid value
                    // Changing sum to num because we now need to add from num till sum < mid
                    sum = num;
                    pieces++;
                } else {
                    // We still have sum less than mid value so increase sum
                    sum += num;
                }
            }

            // At the end we know how many sub arrays can be made
            // within our solution range and that is pieces
            // Now check whether the pieces is exceeds our limit
            if (pieces > k) {
                // This means that the mid value we got is smaller than the required answer
                // i.e. our mid < target where we will move the start index
                start = mid + 1;
            } else {
                // This means that the mid value we got is larget than the required answer
                // i.e. our target < mid where we will move the end index

                // end is shifted to mid only not mid+1 because mid can also be a potential
                // answer because we only check for the condition sum + num > mid not sum + num
                // >= mid in
                end = mid;
            }
        }
        // At the last iteration start, end and mid will point out a single number
        // Since mid is out of scope, we can either return start or end.
        return start;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 2, 5, 10, 8 };
        int k = 2;

        System.out.println("The minimum possible sum which can be splitted into " + k +
                " subarrays is " + sumArray(arr, k));
    }
}
