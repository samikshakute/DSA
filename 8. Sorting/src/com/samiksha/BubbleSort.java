package com.samiksha;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubble(int[] arr) {
        int temp;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 8};
        System.out.println(Arrays.toString(bubble(arr)));
    }
}