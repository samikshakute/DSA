package com.samiksha;

public class ParagramSentence {
    static boolean checkIfParagram(String s) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        if (s.length() < 26) {
            return false;
        }
        for (int i = 0; i < alpha.length(); i++) {
            if (s.indexOf(alpha.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfParagram(sentence));
    }
}