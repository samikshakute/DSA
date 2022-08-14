package com.samiksha;
// Perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself.
// Example: 6. The divisors of 6 are 1, 2, 3 and their sum = 6.
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i==0) {
                sum = sum + i;
            }
        }
        if(n==sum) {
            System.out.println("Perfect number");
        }
        else {
            System.out.println("Not a perfect number");
        }
    }
}