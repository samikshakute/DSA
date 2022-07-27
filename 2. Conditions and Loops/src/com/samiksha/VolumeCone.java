package com.samiksha;

import java.util.Scanner;

public class VolumeCone {
    // Volume = pi * radius square * (height / 3)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of cone: ");
        double r = in.nextDouble();
        System.out.print("Enter the height of cone: ");
        double h = in.nextDouble();
        double volume = Math.PI * r * r * (h/3);
        System.out.println("Volume = "+volume);
    }

}
