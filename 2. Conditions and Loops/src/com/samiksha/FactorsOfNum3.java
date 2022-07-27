package com.samiksha;

import java.util.Scanner;

public class FactorsOfNum3 {
    public static void printFac(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if(i == n/i) {
                    System.out.println(i);
                }
                else {
                    System.out.println(i);
                    System.out.println(n/i);
                }
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