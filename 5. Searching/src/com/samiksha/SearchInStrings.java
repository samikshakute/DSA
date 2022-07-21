package com.samiksha;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Samiksha";
        char target = 'i';
        boolean ans = search(name, target);
        System.out.println(ans);
        System.out.println(Arrays.toString(name.toCharArray())); // [S, a, m, i, k, s, h, a]
    }

    static boolean search(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
//        for(int i = 0; i < name.length(); i++) {
//            if(name.charAt(i) == target) {
//                return true;
//            }
//        }
        // using for each loop
        for (char ch : name.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }


}
