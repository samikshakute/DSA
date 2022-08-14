package com.samiksha;

import java.util.Scanner;

public class SumOfN2 {
    static int getSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Sum of first " + n + " numbers is " + getSum(n));
    }
}