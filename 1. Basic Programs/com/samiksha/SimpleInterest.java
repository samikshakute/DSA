// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.samiksha;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Principal: ");
        int principal = in.nextInt();
        System.out.println("Enter the Time: ");
        int time = in.nextInt();
        System.out.println("Enter the Rate: ");
        double rate = in.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.print("Simple Interest = " + simpleInterest);
    }
}
