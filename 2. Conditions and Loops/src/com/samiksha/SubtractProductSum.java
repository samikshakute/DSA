// Given an integer number n, return the difference between the product of its digits and the sum of its digits.
package com.samiksha;

import java.util.Scanner;

public class SubtractProductSum {
    public static int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;
            sum = sum + r;
            product = product * r;
        }
        int result = product - sum;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int result = subtractProductAndSum(n);
        System.out.println("Result = " + result);
    }
}