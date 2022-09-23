package com.samiksha;

import java.util.Scanner;

public class NumInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the start and end point of search");
        int start1 = in.nextInt();
        int start2 = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= start1 && arr[i] < start2) {
                System.out.println(i + " ");
            }
        }
    }
}