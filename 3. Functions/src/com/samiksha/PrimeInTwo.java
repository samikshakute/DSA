package com.samiksha;

import java.util.Scanner;

public class PrimeInTwo {
    static boolean printPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        int lower = in.nextInt();
        System.out.println("Enter the upper bound: ");
        int upper = in.nextInt();
        for (int i = lower; i <= upper; i++) {
            if (printPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
}