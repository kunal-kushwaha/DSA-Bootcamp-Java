// Find the number of rotations in the given array
// This is nothing but pivot+1 is the minimum element 
// in the array that would have been in the 0th index. 
// So returning pivot + 1 is the number of times the array is rotated
package SolvedProblems.BinarySearch;

public class RotationCount {

    public static int findingPivotWithDuplicateElements(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]){
                return mid;
            }
            else if(arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[end]){
                if(start < end && arr[start] > arr[start + 1]){
                    return start;
                }

                start++;
                
                if(end > start && arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        System.out.println("The array is rotated " + (findingPivotWithDuplicateElements(arr) + 1) + " times");
    }
}
