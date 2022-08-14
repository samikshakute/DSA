package com.samiksha;

import java.util.Scanner;

public class SumOfN {

    public static int printSum(int n) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter "+n+" numbers: ");
        while(n!=0) {
            int t = in.nextInt();
            sum = sum + t;
            n--;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Sum = " + printSum(n));
    }
}