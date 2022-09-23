package com.samiksha;

public class FirstRepeatingChar {
    public static void main(String[] args) {
        String msg = "2345655431";
        int p = '\0';
        for (int i = 0; i < msg.length(); i++) {
            for (int j = i + 1; j < msg.length(); j++) {
                if (msg.charAt(i) == msg.charAt(j)) {
                    System.out.println(msg.charAt(i));
                    p = 1;
                    break;
                }
            }
            if (p != '\0') {
                break;
            }
        }
    }
}