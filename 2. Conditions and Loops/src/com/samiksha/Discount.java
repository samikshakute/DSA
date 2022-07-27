package com.samiksha;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original price of product: ");
        double originalPrice = in.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = in.nextDouble();
        double cal = originalPrice * (discountPercent / 100);
        double discountPrice = originalPrice - cal;
        System.out.println("Discount of Product = " + discountPrice);
    }
}