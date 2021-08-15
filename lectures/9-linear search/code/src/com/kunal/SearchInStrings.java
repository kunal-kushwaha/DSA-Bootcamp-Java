package com.kunal;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';
//        System.out.println(search(name, target));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
   
    
    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    
   }
   
//     // another Method less effecet because of checking every time for array is ascending or descending every time in loop
//      // Return Index
//     public static int binarySearch(int[] arr, int targetIndex) {
//    // Array should be sorted otherwise use Arrays.sort(arr);
//         System.out.println(Arrays.toString(arr));

//         // Maximum comparisons with binary search = 2^ Number of elements in array
//         int start = 0;
//         int end = arr.length - 1;
//         for (int i = 0; i < Math.log10(arr.length) / Math.log10(2); i++) {
//             if (arr[(start + end) / 2] == targetIndex) {
//                 System.out.println("program end");
//                 return (start + end) / 2;
//             } else if (arr[(start + end) / 2] > targetIndex) {
//                 if (arr[start] < arr[end]) {
//                     int k = (start + end) / 2 - 1;
//                     System.out.println(arr[((start + end) / 2) - 1] + " /  (start + end) / 2 -1  = " + k + " This is " + i);
//                     end = (start + end) / 2 - 1;
//                 } else {
//                     int k = (start + end) / 2 + 1;
//                     System.out.println(arr[((start + end) / 2) + 1] + " /  (start + end) / 2 + 1  = " + k + " This is " + i);
//                     start = (start + end) / 2 + 1;
//                 }
//             } else if (arr[(start + end) / 2] < targetIndex) {
//                 if (arr[start] < arr[end]) {
//                     int k2 = (start + end) / 2 + 1;
//                     System.out.println(arr[((start + end) / 2) + 1] + " /  (start + end) / 2 + 1  = " + k2 + " This is " + i);
//                     start = (start + end) / 2 + 1;
//                 } else {
//                     int k = (start + end) / 2 - 1;
//                     System.out.println(arr[((start + end) / 2) - 1] + " /  (start + end) / 2 -1  = " + k + " This is " + i);
//                     end = (start + end) / 2 - 1;
//                 }
//             }

//         }
//         return -1;

//     }
    
}
