package com.samiksha;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // syntax
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
        // int[] rnos = new int[5]'
        // or directly
        // int[] ros = {23, 12, 45, 32, 15};
        // int[] ros; // declaration of array. ros is getting defined in the stack
        // ros = new int[5]; // initialization: actually here object is being created in the memory(heap)
        // System.out.println(ros[4]);
        // String[] arr = new String[4];
        // System.out.println(arr[1]); // this will print null
        // null is basically a special type of literal that can be assigned to reference variables but not to non primitives
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+ " ");
//        }
//        for(int num: arr) { // for every element in array, print the element
//            System.out.print(num+ " "); // here num represents element of the array
//        }

        // Another way of printing array - best way
        System.out.println(Arrays.toString(arr));

    }
}
