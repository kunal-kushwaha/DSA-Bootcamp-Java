package SolvedProblems.Recursion;

import java.util.ArrayList;

public class SearchMultipleOccurances {
    // Without passing ArrayList or Taking the ArrayList that is outside the scope

    static ArrayList<Integer> multipleOccurances(int[] arr, int target, int i){
        ArrayList<Integer> list = new ArrayList<>();

        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }
        
        ArrayList<Integer> listFromBelowCalls = multipleOccurances(arr, target, i + 1);
        list.addAll(listFromBelowCalls);

        return list;
    }

    static ArrayList<Integer> multipleOccurances(int[] arr, int target, int i, ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);
        }
        
        return multipleOccurances(arr, target, i + 1, list);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,6,7,8,9};
        ArrayList<Integer> list = new ArrayList<>();
        int target = 6;

        list = multipleOccurances(arr, target, 0);

        System.out.println(list.toString());
        
    }
}
