package com.samiksha;

import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        System.out.println("Enter the digit to count: ");
        int ch = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == ch) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Count  = " + count);
    }
}
