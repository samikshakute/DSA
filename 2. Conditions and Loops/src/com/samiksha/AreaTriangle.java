package com.samiksha;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base and height of triangle: ");
        int base = in.nextInt();
        int height = in.nextInt();
        int area = (base * height) / 2;
        System.out.println("Area of triangle = " + area);
    }
}
