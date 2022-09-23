package com.samiksha;

import java.util.Arrays;

public class RunningSum {
    static int[] runningSum(int[] a) {
        int[] runSum = new int[a.length];
        int s = 0;
        for (int i = 0; i < runSum.length; i++) {
            s = s + a[i];
            runSum[i] = s;
        }
        return runSum;
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4};
        // Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
        System.out.println(Arrays.toString(runningSum(n)));
    }
}