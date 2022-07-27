package com.samiksha;

import java.util.Scanner;

public class CurvedSACylinder {
    public static void main(String[] args) {
        // Curved surface area of cylinder = 2 * PI * radius * height
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();
        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();
        double csa = 2 * Math.PI * r * h;
        System.out.println("Curved Surface Area = " + csa);
    }
}
