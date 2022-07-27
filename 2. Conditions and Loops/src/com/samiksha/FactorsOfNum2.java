package com.samiksha;
// This is an optimized solution of FactorsOfNum. Check FactorsOfNum3 for more optimized solution with time complexity O(sqrt(n)).

import java.util.Scanner;

public class FactorsOfNum2 {
    public static void printFac(int n) {
        // Let's consider an example say: 24
        // The factors of 16 are 1, 2, 3, 4, 6, 8, 12, 24. Here we can see that 1 (1*24), 2(2*12), 3(3*8), 4(4*6)
        for (int i = 1; i <= n / 2; i++) {
            if (((n % i) == 0)) {
                System.out.println(i);
            }
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        printFac(n);
    }
}
// Time complexity = O(n/2) = O(n)