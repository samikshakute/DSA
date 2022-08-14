package com.samiksha;

import java.util.Scanner;

public class Sum {
    public static int sum(int x, int y) {
        int sum = 0;
        sum = x + y;
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Sum = " + sum(a, b));
    }
}
