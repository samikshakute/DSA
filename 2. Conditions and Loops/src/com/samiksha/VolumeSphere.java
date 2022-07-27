package com.samiksha;

import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        // Volume = 4/3 * PI * r * r * r
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of sphere: ");
        double r = in.nextDouble();
        double volume = (4 / 3) * (Math.PI * r * r * r);
        System.out.println("Volume = " + volume);
    }

    public static class TotalSACube {
        public static void main(String[] args) {
            // Total surface area of cube = 6 * a * a
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the side of cube: ");
            int side = in.nextInt();
            int tsa = 6 * side * side;
            System.out.println("Total Surface Area = " + tsa);
        }
    }
}