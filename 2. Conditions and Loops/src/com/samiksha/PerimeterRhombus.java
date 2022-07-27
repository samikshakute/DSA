package com.samiksha;

import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        // Perimeter = 4 * side
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the side of rhombus: ");
        int side = in.nextInt();
        System.out.println("Perimeter = "+4*side);
    }
}
