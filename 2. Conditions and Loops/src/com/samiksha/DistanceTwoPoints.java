package com.samiksha;

import java.util.Scanner;

public class DistanceTwoPoints {
    public static double findDistance(int x1, int x2, int y1, int y2) {
        double distance = Math.sqrt(((x2 - x1) * (x2 - x1) + ((y2 - y1) * (y2 - y1))));
        return distance;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.println("Enter coordinates (x1, y1): ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.println("Enter coordinates (x2, y2): ");
        x2 = in.nextInt();
        y2 = in.nextInt();
        double distance = findDistance(x1, x2, y1, y2);
        System.out.println("Distance = " + distance);
    }
}