package SolvedProblems.Recursion;

import java.util.ArrayList;

public class StringSubset {
    static ArrayList<String> list = new ArrayList<>();
    static void subset(String processed, String unprocessed){
        
        if(unprocessed.isEmpty()){
            list.add(processed);
            return ;
        }

        // Take it
        subset(processed + unprocessed.charAt(0), unprocessed.substring(1));

        // Leave it
        subset(processed, unprocessed.substring(1));
    }
    public static void main(String[] args) {
        String str = "abc";

        subset("", str);

        for(int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
    }
}
