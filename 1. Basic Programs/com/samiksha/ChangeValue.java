package com.samiksha;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr = {12, 2, 4, 77, 9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[2] = 6; // if you make a change to the object via the ref variable, same object will be changed
    }
}
