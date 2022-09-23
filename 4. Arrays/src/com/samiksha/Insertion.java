package com.samiksha;

import java.util.Arrays;
import java.util.Scanner;

public class Insertion {
    static int[] insertX(int[] arr, int n, int p, int x) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = arr.length - 1; i >= p; i--) {
            newArr[i + 1] = newArr[i];
        }
        newArr[p] = x;
        return newArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = 10;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Initial array: ");
        System.out.println(Arrays.toString(arr));
        int pos = 4;
        int x = 11;
        System.out.println("Array after insertion: ");
        System.out.println(Arrays.toString(insertX(arr, n, pos, x)));
    }
}