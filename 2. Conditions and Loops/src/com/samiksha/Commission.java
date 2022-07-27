package com.samiksha;

import java.util.Scanner;

// If the sales are greater than or equal to 1000 then commission will be 8% otherwise it will be 0.
public class Commission {
    public static double printCommission(int sales) {
        double commissionRate = 0;
        double commission = 0;
        if (sales >= 1000) {
            commissionRate = 0.08;
        } else {
            commissionRate = 0;
        }
        commission = commissionRate * sales;
        return commission;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total number of sales: ");
        int sales = in.nextInt();
        double commission = printCommission(sales);
        System.out.println("Commission = " + commission);
    }
}