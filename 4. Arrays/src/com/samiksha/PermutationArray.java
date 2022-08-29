package com.samiksha;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationArray {
    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] n = new int[size];
        System.out.println("Enter "+size+" elements(elements must be <"+size+"): ");
        for(int i=0; i<size; i++) {
            n[i] = in.nextInt();
            if(n[i] > size-1) {
                System.out.println("Invalid input");
                return;
            }
        }
        System.out.println(Arrays.toString(buildArray(n)));
    }
}