package com.samiksha;

public class RichestCustomerWealth {
    static int maximumWealth(int[][] accounts) {
        int sum = 0, max = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
            ;
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {3, 9, 6}
        };
        System.out.println(maximumWealth(accounts));
    }
}