package com.samiksha;

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = in.nextInt();
        int perimeter = 4 * side;
        System.out.println("Perimeter of square = " + perimeter);
    }
}