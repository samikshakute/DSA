package com.samiksha;

import java.util.Scanner;

public class SumOfDigits {
    public static int printSum(int n) {
        int sum = 0;
        while(n>0) {
            int r = n % 10;
            sum = sum + r;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Sum of digits = "+printSum(num));
    }
}