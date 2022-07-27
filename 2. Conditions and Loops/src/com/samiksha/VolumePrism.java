package com.samiksha;

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        // Volume  = base area * height
        // base area = length * breadth
        Scanner in = new Scanner(System.in);
        int l, b, h, v, a;
        System.out.print("Enter the length of prism: ");
        l = in.nextInt();
        System.out.print("Enter the breadth/width of prism: ");
        b = in.nextInt();
        System.out.print("Enter the height of prism: ");
        h = in.nextInt();
        a = l*b;
        v = a * h;
        System.out.println("Volume = "+v);
    }
}