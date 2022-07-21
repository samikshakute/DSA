 package com.samiksha;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum(); //function call
//        int ans = sum2(); // here ans is the reference variable which will store the returned value
        int ans = sum3(2,4);
        System.out.println(ans);
    }

    // pass the value of numbers when we are calling the method in main()
    static int sum3(int a, int b) {
        return  a+b;
    }

    //return the value
    static int sum2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum; // end of the function
//      System.out.println("This will never execute");
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
