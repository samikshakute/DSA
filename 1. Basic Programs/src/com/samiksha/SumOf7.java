package com.samiksha;

public class SumOf7 {
    static long solve(int A, int B) {
        long sum = 0;
        for (int i = A; i <= B; i++) {
            if (i % 7 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int a = 99, b = 115;
        System.out.println(solve(a, b));
    }
}
