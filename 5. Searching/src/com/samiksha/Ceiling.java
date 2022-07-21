package com.samiksha;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 22, 45, 87};
        int target = 88;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    // returning the index of smallest no >= target
    static int ceiling(int[] arr, int target) {
        // but what if the target is greater than the greatest number in the array
        // in that case we will return -1;
        if(target > arr.length - 1) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}