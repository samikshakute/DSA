package com.samiksha;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num, r, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        /* Armstrong number is a number that is equal to the sum of cubes of its digits.
            153 = (1*1*1) + (5*5*5) + (3*3*3);
        */
        num = in.nextInt();
        int temp = num;
        while(num > 0) {
            r = num % 10;
            sum = sum + (r*r*r);
            num = num / 10;
        }
        if(temp == sum) {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not an armstrong number");
        }
    }
}
