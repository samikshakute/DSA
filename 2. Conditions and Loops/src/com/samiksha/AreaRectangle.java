package com.samiksha;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length, breadth;
        System.out.print("Enter the length and breadth of rectangle: ");
        length = in.nextInt();
        breadth = in.nextInt();
        int area = length * breadth;
        System.out.println("Area of rectangle = " + area);
    }
}
