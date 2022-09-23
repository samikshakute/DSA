package com.samiksha;

public class EvenNumOfDigits {
    static int countDigits(int[] num) {
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            int r = num[i] % 10;
            num[i] = num[i] / 10;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] num = {12, 345, 2, 6, 7896};
        countDigits(num);
    }
}
