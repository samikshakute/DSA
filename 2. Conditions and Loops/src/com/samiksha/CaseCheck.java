package com.samiksha;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // trim() is used to remove extra white spaces
        char c = in.next().trim().charAt(0);
        if(c>='a'  && c<='z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
}
