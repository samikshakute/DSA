package com.samiksha;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = in.nextInt();
        System.out.println("Enter the exponent: ");
        int exponent = in.nextInt();
        int exp = exponent;
        int result = 1;
        while (exponent != 0) {
            result = result * base;
            exponent--;
        }
        System.out.println(+base + " to the power " + exp + " is " + result);

        // We can also use Math.pow function
        System.out.println(Math.pow(base, exp));
    }
}