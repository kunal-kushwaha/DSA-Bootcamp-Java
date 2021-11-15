package com.kunal.strings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(padRet("", "12").size());
        System.out.println(padCount("", "12"));
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }

    }

    static ArrayList<String> padRet(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(padRet(p + ch, up.substring(1)));
        }
        return list;
    }

    static int padCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0'; // this will convert '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
    
//     leetcode sollution solution ===========================================================================================
//     https://leetcode.com/problems/letter-combinations-of-a-phone-number/submissions/
//     =======================================================================================================================
    
	static ArrayList<String> letterCombinations_list_p_up(String p, String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add(p);
			return list;
		}

		ArrayList<String> list = new ArrayList<>();

		// this will convert '2' into 2
		int digit = up.charAt(0) - '0';

		if (digit == 1) {
			return null;
		} else if (digit < 7) {

			for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
				char ch = (char) ('a' + i - 3);
				list.addAll(letterCombinations_list_p_up(p + ch, up.substring(1)));
			}
		} else {
			if (digit == 7) {
				for (int i = 7; i <= 10; i++) {
					char ch = (char) (105 + i);
					list.addAll(letterCombinations_list_p_up(p + ch, up.substring(1)));
				}
			} else if (digit == 8) {
				for (int i = 8; i <= 10; i++) {
					char ch = (char) (108 + i);
					list.addAll(letterCombinations_list_p_up(p + ch, up.substring(1)));
				}
			} else {
				for (int i = 9; i <= 12; i++) {
					char ch = (char) (110 + i);
					list.addAll(letterCombinations_list_p_up(p + ch, up.substring(1)));
				}
			}
		}
		return list;
	}

	static List<String> letterCombinations_list(String up) {
		if (up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>();
			list.add("");
			return list;
		}
		ArrayList<String> ans = new ArrayList<>();
		ans = letterCombinations_list_p_up("",up);
		return ans;

	}

}
