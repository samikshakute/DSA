package com.samiksha;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetArr {
    static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            a.add(index[i], nums[i]);
        }
        System.out.println(a);
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = a.get(i);
        }
//        int[] target = new int[nums.length];
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i-1; j>=index[i]; j--) {
//                target[j+1] = target[j];
//            }
//            target[index[i]] = nums[i];
//        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));

    }
}
