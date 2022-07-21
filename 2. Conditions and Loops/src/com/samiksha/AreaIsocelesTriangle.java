package com.samiksha;
import java.util.Scanner;
import java.lang.Math;
public class AreaIsocelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Area of isoceles triangle = 1/2 * b * sqrt(a square - (b square / 4))
        //                           = 1/4 * b sqrt(4a square - b square)
        // here a = side 1
        // b = side 2
        System.out.print("Enter side 1: ");
        int a = in.nextInt();
        System.out.println("Enter side 2: ");
        int b = in.nextInt();
        double area = 1/4 * b * (Math.sqrt(4*a*a - b*b));
        System.out.println("Area = "+area);
    }
}
