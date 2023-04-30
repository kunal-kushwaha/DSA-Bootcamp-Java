package SolvedProblems.Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubset {
    static void subset(String processed, String unprocessed){
        
        if(unprocessed.isEmpty()){
            System.out.print(processed + " ");
            return ;
        }

        // Take it
        subset(processed + unprocessed.charAt(0), unprocessed.substring(1));

        // Leave it
        subset(processed, unprocessed.substring(1));
    }

    static ArrayList<String> subsetRet(String processed, String unprocessed){
        
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        // Take it
        ArrayList<String> left = subsetRet(processed + unprocessed.charAt(0), unprocessed.substring(1));

        // Leave it
        ArrayList<String> right = subsetRet(processed, unprocessed.substring(1));

        left.addAll(right);

        return left;
    }

    // Converting the recursion into iteration
    static List<List<Integer>> subsetIteration(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        
        outer.add(new ArrayList<>());

        for(int num : arr){
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }

    public static void main(String[] args) {
        // String str = "abc";

        // // subset("", str);

        // ArrayList<String> list = subsetRet("", str);

        // for(int i = 0; i < list.size(); i++){
        //     System.out.print(list.get(i) + " ");
        // }

        // For recursion into iteration
        int[] arr = {1,2,3};
        List<List<Integer>> ans = subsetIteration(arr);

        for (List<Integer> list : ans){
            System.out.println(list);
        }

    }
}
