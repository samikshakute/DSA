package com.samiksha;

import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        // Perimeter = 2(a+b)
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = in.nextInt();
        System.out.print("Enter side 2: ");
        int b = in.nextInt();
        int p = 2 * (a + b);
        System.out.println("Perimeter = " + p);
    }
}
