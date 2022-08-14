package com.samiksha;

import java.util.Scanner;

public class SumOfN {
    static int getSum(int n) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Sum = " + getSum(n));
    }
}
// This is a naive solution with complexity O(n). Check out SumOfN2 for an efficient solution.