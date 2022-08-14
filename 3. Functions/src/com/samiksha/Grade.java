package com.samiksha;

import java.util.Scanner;

public class Grade {
    public static void printGrade(int marks) {
        if (marks >= 91) {
            System.out.println("AA");
        } else if (marks <= 90 && marks >= 81) {
            System.out.println("AB");
        } else if (marks <= 80 && marks >= 70) {
            System.out.println("BB");
        } else if (marks <= 70 && marks >= 61) {
            System.out.println("BC");
        } else if (marks <= 60 && marks >= 51) {
            System.out.println("CD");
        } else if (marks <= 50 && marks >= 41) {
            System.out.println("DD");
        } else if (marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks!");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marks out of 100: ");
        int marks = in.nextInt();
        printGrade(marks);
    }
}
