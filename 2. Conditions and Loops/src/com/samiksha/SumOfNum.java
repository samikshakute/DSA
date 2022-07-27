package com.samiksha;
// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.Scanner;

public class SumOfNum {

    public static int printSum() {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            sum = sum + num;
            if (num == 0) {
                return sum;
            }
        }
    }
    public static void main(String[] args) {
        int sum = printSum();
        System.out.println("Sum = " + sum);
    }
}
