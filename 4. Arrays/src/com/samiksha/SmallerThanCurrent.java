package com.samiksha;

import java.util.Arrays;

public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int[] s = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            s[i] = count;
            count = 0;
        }
        return s;
    }
}