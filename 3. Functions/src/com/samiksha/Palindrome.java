package com.samiksha;

import java.util.Scanner;

public class Palindrome {
    static int palindrome(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            rev = rev * 10 + r;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int rev = palindrome(n);
        if (n == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}