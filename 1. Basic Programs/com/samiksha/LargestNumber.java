package com.samiksha;// Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println(+num1 + " is greater than " + num2);
        } else {
            System.out.println(+num2 + " is greater than " + num1);
        }
    }
}