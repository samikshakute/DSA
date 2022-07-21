package com.samiksha;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // Swapping array elements
        int[] arr = {1, 3, 6, 8, 4};
        swap(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start<end) {
            swap(arr, start, end);
            start++;
            end --;
        }
    }
    static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}