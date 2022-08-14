package com.samiksha;

import java.util.Scanner;

public class PalindromeNum {
    public static int rev(int n) {
        int ans = 0;
        while(n>0) {
            int r = n % 10;
            n = n/10;
            ans = ans*10+r;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int r= rev(n);
        if (n == r) {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
