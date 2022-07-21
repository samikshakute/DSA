package com.samiksha;

import java.util.Scanner;

public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();
        double p = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle: " + p);
    }
}