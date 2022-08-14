package com.samiksha;

import java.util.Scanner;

// Enter the value of n(n>=3)
// (n1)square + n2(square) = n3
public class PythagoreanTriplet {
    static boolean isTriplet(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    int x = arr[i] * arr[i], y = arr[j] * arr[j], z = arr[k] * arr[k];
                    if (x + y == z || x + z == y || z + y == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[20];
        System.out.print("Enter the value of n: (n should be greater than or equal to 3): ");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(isTriplet(arr, n));
    }
}