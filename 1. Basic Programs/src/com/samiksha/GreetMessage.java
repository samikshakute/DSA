// Take name as input and print a greeting message for that particular name.
package com.samiksha;

import java.util.Scanner;

public class GreetMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String msg = "Hello " + name;
        System.out.println(msg);
    }
}
