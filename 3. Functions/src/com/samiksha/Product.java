package com.samiksha;

import java.util.Scanner;

public class Product {
    public static int product(int x, int y) {
        int p = 0;
        p= x*y;
        return p;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = in.nextInt();
        int b =in.nextInt();
        System.out.println("Product = "+product(a, b));
    }
}