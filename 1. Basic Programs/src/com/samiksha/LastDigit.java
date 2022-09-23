package com.samiksha;

public class LastDigit {
    static int solve(String a, String b) {
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        double ans = Math.pow(a1, b1);
        return (int)ans;
    }
    public static void main(String[] args) {
        String a = "11";
        String b = "11";
        System.out.println(solve(a, b));
    }
}
