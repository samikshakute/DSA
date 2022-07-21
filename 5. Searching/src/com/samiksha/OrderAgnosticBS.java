package com.samiksha;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18, -10, -4, -2, 0, 4, 7, 9, 23, 56, 78, 98};
        int[] arr = {98, 78, 34, 23, 12, 9, 7, 0, -2, -8};
        int target = 98;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}