package com.samiksha;

public class LargestCommonSubsequence {
    static int solve(String s1, String s2) {
        int len = 0;
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    len++;
                    break;
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String s1 = "aieef";
        String s2 = "klaief";
        System.out.println(solve(s1, s2));
    }
}
