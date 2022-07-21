package com.samiksha;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length, breadth;
        System.out.print("Enter the length of rectangle: ");
        length = in.nextInt();
        System.out.print("Enter the breadth of rectangle: ");
        breadth = in.nextInt();
        int p = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + p);
    }
}