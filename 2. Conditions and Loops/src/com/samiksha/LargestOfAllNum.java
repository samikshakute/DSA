package com.samiksha;

import java.util.Scanner;

public class LargestOfAllNum {
    public static int printLargestNum() {
        Scanner in = new Scanner(System.in);
        int large = 0;
        while (true) {
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            if (num > large) {
                large = num;
            }
            if (num == 0) {
                return large;
            }
        }
    }

    public static void main(String[] args) {
        int ans = printLargestNum();
        System.out.println("Largest number = " + ans);
    }
}