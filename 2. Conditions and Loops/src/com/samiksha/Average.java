package com.samiksha;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int sum = 0;
        System.out.print("Enter "+n+" numbers: ");
        for(int i=0; i<n; i++) {
            int num = in.nextInt();
            sum = sum + num;
        }
        double avg = (sum / (double)n); // typecasting n from int to double for decimal division
        System.out.println("Average = "+avg);
    }
}