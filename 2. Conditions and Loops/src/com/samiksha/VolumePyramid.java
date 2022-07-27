package com.samiksha;

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        // Volume = (length * width * height) / 3
        Scanner in = new Scanner(System.in);
        int l, w, h, v;
        System.out.print("Enter the length of pyramid: ");
        l = in.nextInt();
        System.out.print("Enter the width of pyramid: ");
        w = in.nextInt();
        System.out.print("Enter the height of pyramid: ");
        h = in.nextInt();
        v = (l * w * h) / 3;
        System.out.println("Volume = " + v);
    }
}