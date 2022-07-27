package com.samiksha;

import java.util.Scanner;

public class AreaEquilateral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Area of equilateral triangle  = root 3 / 4 * side square
        System.out.print("Enter the side: ");
        double side = in.nextDouble();
        double area = Math.sqrt(3) / 4 * (side * side);
        System.out.println("Area = " + area);
    }
}
