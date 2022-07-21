// Input currency in rupees and output in USD.
package com.samiksha;

import java.util.Scanner;

public class RupeeToUsd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float rupee;
        System.out.print("Enter currency in rupees: ");
        rupee = in.nextFloat();
        if (rupee > 0) {
            float usd = rupee / 75.58f;
            System.out.println("Currency in dollars: " + usd);
        }
    }
}
