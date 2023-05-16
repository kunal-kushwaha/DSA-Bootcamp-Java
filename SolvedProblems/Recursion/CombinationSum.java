
// https://leetcode.com/problems/combination-sum/
import java.util.*;

public class CombinationSum {
    public static void getCombination(int[] candidates, int target, int index, List<Integer> processed, List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(processed));
            return;
        }
        if(target < 0 || index >= candidates.length){
            return;
        }

        for(int i = index; i < candidates.length; i++){
            processed.add(candidates[i]);
            getCombination(candidates, target - candidates[i], i, processed, result);
            processed.remove(processed.size() - 1);
        }
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        getCombination(candidates, target, 0, new ArrayList<Integer>(), result);
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = { 2, 3, 6, 7 };
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}
