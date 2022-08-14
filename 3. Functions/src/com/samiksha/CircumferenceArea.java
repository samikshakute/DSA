package com.samiksha;

import java.util.Scanner;

public class CircumferenceArea {
    public static void printCircumferenceArea(double radius) {
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double r = in.nextDouble();
        printCircumferenceArea(r);
    }

}