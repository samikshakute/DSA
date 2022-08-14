package com.samiksha;

import java.util.Scanner;

public class CgpaProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int n = in.nextInt();
        System.out.println("Enter the grade points of " + n + " subjects:");
        double g, s = 0;
        for (int i = 0; i < n; i++) {
            g = in.nextDouble();
            s = s + g;
        }
        double cgpa = s / n;
        double cgpaPercent = 9.5 * cgpa;
        System.out.println(cgpa);
        System.out.println(cgpaPercent);
    }
}