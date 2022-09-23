package com.samiksha;

import java.util.Arrays;

public class ConcatenationArray {
    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 8};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
