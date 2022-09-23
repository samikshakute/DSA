package com.samiksha;

import java.util.Arrays;
import java.util.HashSet;

// Given a string, find the first repeated character in it. We need to find the character that occurs more than once and whose index of second occurrence is smallest.
public class FirstRepeatingChar2 {
    public static void main(String[] args) {
        String s = "123456554321";
        char[] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));
        HashSet<Character> h = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = ch[i];
            if (h.contains(c)) {
                System.out.println(c);
                break;
            } else {
                h.add(c);
            }
        }
    }
}
