package com.samiksha;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 6, 1},
        };
        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum = sum + anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
