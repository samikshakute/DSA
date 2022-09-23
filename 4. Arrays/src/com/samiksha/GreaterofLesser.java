package com.samiksha;

import java.util.ArrayList;

public class GreaterofLesser {
    static int solve(ArrayList<Integer> A, ArrayList<Integer> B, int c) {
        int largeCount = 0, smallCount = 0;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) > c) {
                largeCount++;
            }
            if (B.get(i) < c) {
                smallCount++;
            }
        }
        return Math.max(largeCount, smallCount);
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>() {
            {
                add(1);
                add(10);
                add(100);
            }
        };
        ArrayList<Integer> B = new ArrayList<>() {
            {
                add(9);
                add(9);
                add(9);
            }
        };
        int c = 50;
        System.out.println(solve(A, B, c));
    }
}