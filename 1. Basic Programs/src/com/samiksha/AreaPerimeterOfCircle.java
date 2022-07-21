package com.samiksha;

import java.util.Scanner;

public class AreaPerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.println("Perimeter is " + (2 * Math.PI * radius));
        System.out.println("Area is = " + Math.PI * radius * radius);
    }
}
