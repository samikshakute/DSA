package com.samiksha;

import java.util.Scanner;

public class AreaCircle {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius = in.nextFloat();
        System.out.println("Area of circle = " + Math.PI * radius * radius);
    }
}
