package com.samiksha;

import java.util.Arrays;
import java.util.Scanner;

// 1 2 3 4 5 6 --> 1 4 2 5 3 6 for n = 3
public class ShuffleArray {
    static int[] shuffle(int[] nums, int n) {
        int start1 = 0;
        int start2 = n;
        int i = 0;
        int[] s = new int[nums.length];
        while (start1 < start2 && start2 < nums.length) {
            s[i] = nums[start1];
            i++;
            s[i++] = nums[start2];
            start1++;
            start2++;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = in.nextInt();
        int[] nums = new int[2 * n];
        System.out.println("Enter " + 2 * n + " elements in the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }
}