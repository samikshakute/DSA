package com.samiksha;

import java.util.Scanner;

public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the base of parallelogram: ");
        int base = in.nextInt();
        System.out.print("Enter the height of parallelogram: ");
        int height = in.nextInt();
        int area = base * height;
        System.out.println("Area of parallelogram = " + area);
    }
}