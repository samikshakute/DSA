package com.samiksha;

import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        // Volume = PI * r * r * h
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        double r = in.nextDouble();
        System.out.print("Enter the height of cylinder: ");
        double h = in.nextDouble();
        double volume = Math.PI * r * r * h;
        System.out.println("Volume = " + volume);
    }
}