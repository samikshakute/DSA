package com.samiksha;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit: ");
        String fruit = in.next();
//        switch (fruit) {
//            case "Apple":
//                System.out.println("This is apple");
//                break;
//            case "Mango":
//                System.out.println("This is mango");
//                break;
//        }

        // Enhanced switch statement:
        switch (fruit) {
            case "Apple" -> System.out.println("This is apple");
            case "Mango" -> System.out.println("This is mango");
        }
    }
}
