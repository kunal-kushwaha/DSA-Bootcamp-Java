// https://leetcode.com/problems/longest-substring-without-repeating-characters/
import java.util.*;

public class LongestSubStringWithoutRepetition{
    public static ArrayList<String> getSubset(String s){
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                list.add(s.substring(i, j+1));
            }
        }
        return list;
    }

    public static ArrayList<Integer> getLength(ArrayList<String> list){
        ArrayList<Integer> lengths = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){

            String value = list.get(i);
            LinkedHashSet<Character> set = new LinkedHashSet<>();

            for(int j = 0; j < value.length(); j++){
                set.add(value.charAt(j));
            }

            String compare = "";
            for(char ch: set){
                compare += ch;
            }

            if(value.length() == compare.length()){
                lengths.add(value.length());
            }
        }
        return lengths;
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        
        ArrayList<String> list = getSubset(s);
        ArrayList<Integer> lengths = getLength(list);

        // Returning the max value
        int max = lengths.get(0);
        for(int i = 1; i < lengths.size(); i++){
            if(max < lengths.get(i)){
                max = lengths.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args){
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
}