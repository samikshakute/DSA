package com.samiksha;

import java.util.Scanner;

public class PerimeterEquilateral {
    public static void main(String[] args) {
        // Perimeter = 3 * side
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side = in.nextInt();
        int p = 3 * side;
        System.out.println("Perimeter = "+p);
    }
}
