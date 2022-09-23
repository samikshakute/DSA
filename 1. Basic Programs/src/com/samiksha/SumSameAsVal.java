package com.samiksha;

import java.util.Scanner;

public class SumSameAsVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}
