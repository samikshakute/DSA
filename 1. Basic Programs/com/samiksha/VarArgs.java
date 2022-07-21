package com.samiksha;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(12, 13, 5, 6, 8, 88, 44);
        fun(); // this will be an empty array
        multiple(12, 12, "Samiksha", "Akshada", "Ssadd");
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String... names) { // the variable length arguments(var-arg) must always be at the end
    }
}
