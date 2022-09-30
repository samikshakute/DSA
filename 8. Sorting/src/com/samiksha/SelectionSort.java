package com.samiksha;

import java.util.Arrays;

public class SelectionSort {
    static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int max = maxIndex(arr, end);
            int temp = arr[max];
            arr[max] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }

    static int maxIndex(int[] arr, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 5, 2};
        System.out.println(Arrays.toString(selection(arr)));
    }
}