package com.samiksha;
import java.util.Scanner;
import java.lang.Math;
public class AreaIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Area of isosceles triangle = 1/2 * b * sqrt(a square - (b square / 4))
        //                           = 1/4 * b sqrt(4a square - b square)
        // here a = side 1
        // b = side 2
        System.out.print("Enter side 1: ");
        double a = in.nextDouble();
        System.out.print("Enter side 2: ");
        double b = in.nextDouble();
        double area = (b/4) * (Math.sqrt((4*a*a) - (b*b)));
        System.out.println("Area = "+area);
    }
}