
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.*;

public class LetterCombinationOfPhoneNumber {
    // Without return type
    public static void getCombination(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.print(processed + " ");
            return;
        }

        int digit = unprocessed.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            if (i == 26) {
                continue;
            }
            char ch = (char) ('a' + i);
            getCombination(processed + ch, unprocessed.substring(1));
        }
    }

    // With return type
    public static ArrayList<String> returningCombination(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            if (i == 26) {
                continue;
            }
            char ch = (char) ('a' + i);
            list.addAll(returningCombination(processed + ch, unprocessed.substring(1)));
        }
        return list;
    }

    public static List<String> getLetters(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        int digit = unprocessed.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        if (digit == 7) {
            start = 15;
            end = 19;
        } else if (digit == 9) {
            start = 22;
            end = 26;
        } else if (digit == 8) {
            start = 19;
            end = 22;
        } else {
            start = (digit - 1) * 3 - 3;
            end = (digit * 3) - 3;
        }
        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            list.addAll(getLetters(processed + ch, unprocessed.substring(1)));
        }
        return list;
    }

    public static List<String> letterCombinations(String digits) {
        List<String> list = getLetters("", digits);
        return list;
    }

    public static void main(String[] args) {
        String str = "23";
        // getCombination("", str);
        List<String> list = letterCombinations(str);
        System.out.println(list);
    }
}