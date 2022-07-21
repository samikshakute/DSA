// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.samiksha;

import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter two numbers: ");
        num1 = in.nextInt();
        num2 = in.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = in.next().charAt(0);
        int result = 0;
        if (op == '+' || op == '-' || op == '*' || op == '/') {
            if (op == '+') {
                result = num1 + num2;
            }
            if (op == '-') {
                result = num1 - num2;
            }
            if (op == '*') {
                result = num1 * num2;
            }
            if (op == '/') {
                if (num2 != 0) {
                    result = num1 / num2;
                }
            }
            System.out.println(result);
        } else {
            System.out.println("Invalid operator!!");
        }
    }
}