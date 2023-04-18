package SolvedProblems.Recursion;

public class SearchInRotatedBinarySearch {
    static int searchInRotatedBinarySearch(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        
        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target < arr[mid] && target >= arr[start]){
                return searchInRotatedBinarySearch(arr, target, start, mid - 1);
            }
            else{
                return searchInRotatedBinarySearch(arr, target, mid + 1, end);
            }
        }

        if(target > arr[mid] && target <= arr[end]){
                return searchInRotatedBinarySearch(arr, target, mid + 1, end);
        }        
        return searchInRotatedBinarySearch(arr, target, start, mid - 1);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target = 2;

        System.out.println(searchInRotatedBinarySearch(arr, target, 0, arr.length - 1));
    }
}
