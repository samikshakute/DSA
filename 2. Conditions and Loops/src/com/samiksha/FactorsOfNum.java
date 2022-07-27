package com.samiksha;
// This is a naive solution check FactorsOfNum2

import java.util.Scanner;

public class FactorsOfNum {
    public static void printFac(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        printFac(num);
    }
}
// Time complexity = O(n)