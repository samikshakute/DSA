package com.samiksha;

// Count of distinct elements in the array i.e without duplicates
public class DistinctElements {
    static int countDistinct(int[] arr, int len) {
        int flag = 0, count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 5, 7, 8, 10};
        // op: 8, 9, 5, 7, 12 = 5
        System.out.println(countDistinct(arr, arr.length));
    }
}
