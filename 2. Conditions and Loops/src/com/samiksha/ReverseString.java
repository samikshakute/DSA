package com.samiksha;

import java.util.Scanner;

public class ReverseString {
    public static String printReverseString(String s) {
        String rev="";
        for(int i=s.length()-1; i>=0; i--) {
            rev = rev+s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        System.out.println("Reverse string = "+printReverseString(s));
    }
}