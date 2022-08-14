package com.samiksha;

import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int negativeSum = 0;
        int posEvenSum = 0;
        int posOddSum = 0;
        System.out.println("Enter numbers: (positive, negative): ");
        while(true) {
            int n = in.nextInt();
            if(n<0) {
                negativeSum = negativeSum + n;
            }
            if(n>0) {
                if(n%2 == 0) {
                    posEvenSum = posEvenSum + n;
                }
                else {
                    posOddSum = posOddSum + n;
                }
            }
            if(n==0) {
                break;
            }
        }
        System.out.println("Sum of negative numbers = "+negativeSum);
        System.out.println("Sum of positive even numbers = "+posEvenSum);
        System.out.println("Sum of positive odd numbers = "+posOddSum);

    }
}
