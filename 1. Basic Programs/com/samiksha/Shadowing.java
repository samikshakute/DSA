package com.samiksha;

public class Shadowing {
    static int x = 10; // this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); // 10
        int x; // the class variable at line 4 is shadowed by this
//      System.out.println(x); // scope will begin when the value is initialised
        x= 20;
        System.out.println(x); // 20
        fun();
    }
    static void fun() {
        System.out.println(x); // 10
    }
}
