package com.samiksha;

public class GoodPairs {
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i+1; j<nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
        int i = 0;
        int j = i + 1;
        while (i < j) {
            if (nums[i] == nums[j]) {
                count++;
            }
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numIdenticalPairs(nums));
    }
}
