package com.samiksha;

import java.util.Scanner;

public class Vote {
    public static void isEligible(int age) {
        if(age >=18) {
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        isEligible(age);
    }

    public static class PythogoreanTriplet {
    }

    public static class AllPrime {
    }
}
