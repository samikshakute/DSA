package com.samiksha;

import java.util.Scanner;

// Compound Interest = P(1+r/100)^t where P = principal, r = rate of interest, t = time (in years)
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double principal, rate, time;
        System.out.println("Enter the principal: ");
        principal = in.nextDouble();
        System.out.println("Enter the rate: ");
        rate = in.nextDouble();
        System.out.println("Enter the time in years: ");
        time = in.nextDouble();
        double c = principal * Math.pow((1 + rate / 100), time);
        System.out.println("Compound Interest: " + c);
    }
}