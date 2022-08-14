package com.samiksha;

import java.util.Scanner;

public class EvenOdd {
    public static void evenOdd(int n) {
        if((n & 1) == 1) {
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        evenOdd(n);
    }
}