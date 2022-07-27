package com.samiksha;

import java.util.Scanner;

// Area of triangle when sides are given: sqrt (s*(s-a) * (s-b) * (s-c))
// where a, b and c are lengths of sides of triangle, and s = (a+b+c)/2
// Length of sides must be positive and sum of any two sides must be greater than third side.
public class AreaTriangle2 {
    public static void findArea(double a, double b, double c) {
        if (a < 0 || b < 0 || c < 0 || a + b <= c || b + c <= a || a + c <= b) {
            System.out.println("Invalid triangle");
            System.exit(0);
        }
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of triangle  = " + area);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of sides of triangle(a, b, c): ");
        System.out.print("a = ");
        double a = in.nextDouble();
        System.out.print("b = ");
        double b = in.nextDouble();
        System.out.print("c = ");
        double c = in.nextDouble();
        findArea(a, b, c);
    }
}