// To calculate Fibonacci Series up to n numbers.
package com.samiksha;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.print(+n1 + " " + n2);
        for (int i = 2; i < n; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
