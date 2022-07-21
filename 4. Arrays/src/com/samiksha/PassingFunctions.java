package com.samiksha;

import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {12, 13, 22, 67, 88};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) { // a copy of nums is created that is pointing to the same array
        arr[2] = 34;
    }
}
