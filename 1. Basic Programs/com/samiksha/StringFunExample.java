package com.samiksha;

import java.util.Scanner;

public class StringFunExample {
    public static void main(String[] args) {
//      String message = greet();
//      System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

    static String greet() {
//      return 23; // This will give us an error as return type must be same as specified. i.e. it must be String type in this case.
        String greeting = "How are you";
        return greeting;
    }
}
