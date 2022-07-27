package com.samiksha;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int units = in.nextInt();
        double billToPay = 0;
        if (units < 100) {
            billToPay = units * 1.20;
        } else if (units < 300) {
            billToPay = 100 * 1.20 + (units - 100) * 2;
        } else if (units > 300) {
            billToPay = 100 * 1.20 + 200 * 2 + (units - 300) * 3;
        }
        System.out.println("The electricity bill for " + units + " is: " + billToPay);
    }
}