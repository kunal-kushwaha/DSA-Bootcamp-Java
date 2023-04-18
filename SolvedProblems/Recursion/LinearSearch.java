package SolvedProblems.Recursion;

public class LinearSearch {
    static int search(int[] arr, int target, int i){
        if(i > arr.length - 1){
            return -1;
        }

        if(arr[i] == target) {
            return i;
        }

        return search(arr, target, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,8,5,3,6,8,9,7,6};
        int target = 5;
        System.out.println(search(arr, target, 0));
    }
}
