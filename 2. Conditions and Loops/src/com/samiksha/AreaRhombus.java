package com.samiksha;

import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of diagonal1: ");
        int d1 = in.nextInt();
        System.out.print("Enter the length of diagonal2: ");
        int d2 = in.nextInt();
        int area = (d1 * d2) / 2;
        System.out.println("Area of rhombus: " + area);
    }
}