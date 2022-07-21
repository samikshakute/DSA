package com.samiksha;

public class MethodOverloading {
    public static void main(String[] args) {
        fun(10);
        fun("Samiksha Kute");
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
